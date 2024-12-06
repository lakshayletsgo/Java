import java.util.*;

public class PageReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter the number of frames: ");
        int frameCount = sc.nextInt();

        System.out.print("Enter the number of pages in the reference string: ");
        int pageCount = sc.nextInt();
        int[] referenceString = new int[pageCount];
        System.out.println("Enter the reference string values:");
        for (int i = 0; i < pageCount; i++) {
            referenceString[i] = sc.nextInt();
        }

        System.out.println("\nChoose a Page Replacement Policy:");
        System.out.println("1. First In First Out (FIFO)");
        System.out.println("2. Least Recently Used (LRU)");
        System.out.println("3. Optimal Page Replacement");
        int policyChoice = sc.nextInt();

        // Execute chosen policy
        if (policyChoice == 1) {
            executeFIFO(referenceString, frameCount);
        } else if (policyChoice == 2) {
            executeLRU(referenceString, frameCount);
        } else if (policyChoice == 3) {
            executeOptimal(referenceString, frameCount);
        } else {
            System.out.println("Invalid choice. Please run the program again.");
        }

        sc.close();
    }

    // FIFO Algorithm
    private static void executeFIFO(int[] refString, int frameLimit) {
        Queue<Integer> frameQueue = new LinkedList<>();
        Set<Integer> currentFrames = new HashSet<>();
        int faultCount = 0;

        for (int page : refString) {
            if (!currentFrames.contains(page)) { // Page fault occurs
                if (frameQueue.size() == frameLimit) {
                    int evictedPage = frameQueue.poll();
                    currentFrames.remove(evictedPage);
                }
                frameQueue.add(page);
                currentFrames.add(page);
                faultCount++;
            }
            System.out.println("Current Queue: " + frameQueue + " | Total Faults: " + faultCount);
        }
        System.out.println("Final Fault Count using FIFO: " + faultCount);
    }

    // LRU Algorithm
    private static void executeLRU(int[] refString, int frameLimit) {
        LinkedHashMap<Integer, Integer> lruCache = new LinkedHashMap<>(frameLimit, 0.75f, true);
        int faultCount = 0;

        for (int page : refString) {
            if (!lruCache.containsKey(page)) { // Page fault occurs
                if (lruCache.size() == frameLimit) {
                    int leastUsed = lruCache.keySet().iterator().next();
                    lruCache.remove(leastUsed);
                }
                faultCount++;
            }
            lruCache.put(page, 1); // Update access
            System.out.println("Current Cache: " + lruCache.keySet() + " | Total Faults: " + faultCount);
        }
        System.out.println("Final Fault Count using LRU: " + faultCount);
    }

    // Optimal Algorithm
    private static void executeOptimal(int[] refString, int frameLimit) {
        List<Integer> currentFrames = new ArrayList<>();
        int faultCount = 0;

        for (int index = 0; index < refString.length; index++) {
            int page = refString[index];
            if (!currentFrames.contains(page)) { // Page fault occurs
                if (currentFrames.size() == frameLimit) {
                    int evictIndex = findEvictionIndex(refString, currentFrames, index);
                    currentFrames.set(evictIndex, page);
                } else {
                    currentFrames.add(page);
                }
                faultCount++;
            }
            System.out.println("Current Frames: " + currentFrames + " | Total Faults: " + faultCount);
        }
        System.out.println("Final Fault Count using Optimal: " + faultCount);
    }

    // Helper for Optimal: Find index of the frame to be evicted
    private static int findEvictionIndex(int[] refString, List<Integer> frames, int currentIndex) {
        int farthestPageIndex = -1;
        int farthestDistance = -1;

        for (int i = 0; i < frames.size(); i++) {
            int framePage = frames.get(i);
            int nextUse = Integer.MAX_VALUE;
            for (int j = currentIndex + 1; j < refString.length; j++) {
                if (refString[j] == framePage) {
                    nextUse = j;
                    break;
                }
            }
            if (nextUse > farthestDistance) {
                farthestDistance = nextUse;
                farthestPageIndex = i;
            }
        }
        return farthestDistance == Integer.MAX_VALUE ? 0 : farthestPageIndex;
    }
}

