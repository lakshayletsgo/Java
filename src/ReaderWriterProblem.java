import java.util.concurrent.Semaphore;

public class ReaderWriterProblem {
    private static int sharedResource = 0; // Shared resource
    private static Semaphore readSemaphore = new Semaphore(1); // Controls access to the reader count
    private static Semaphore writeSemaphore = new Semaphore(1); // Controls write access to shared resource
    private static int readerCount = 0; // Tracks number of readers accessing the resource

    public static void main(String[] args) {
        // Creating reader and writer threads
        Thread writer = new Thread(new Writer(), "Writer");
        Thread reader1 = new Thread(new Reader(), "Reader1");
        Thread reader2 = new Thread(new Reader(), "Reader2");

        // Starting threads
        writer.start();
        reader1.start();
        reader2.start();
    }

    // Writer Class
    static class Writer implements Runnable {
        @Override
        public void run() {
            try {
                writeSemaphore.acquire(); // Acquire write access
                printState(Thread.currentThread().getName(), "Acquired write access");
                sharedResource++; // Simulate writing
                Thread.sleep(1000); // Simulate delay
                printState(Thread.currentThread().getName(), "Finished writing");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                writeSemaphore.release(); // Release write access
                printState(Thread.currentThread().getName(), "Released write access");
            }
        }
    }

    // Reader Class
    static class Reader implements Runnable {
        @Override
        public void run() {
            try {
                readSemaphore.acquire(); // Protect readerCount
                readerCount++;
                if (readerCount == 1) {
                    writeSemaphore.acquire(); // First reader locks write access
                    printState(Thread.currentThread().getName(), "First reader locked write access");
                }
                readSemaphore.release();
                printState(Thread.currentThread().getName(), "Reading resource");

                Thread.sleep(1000); // Simulate delay

                readSemaphore.acquire(); // Protect readerCount
                readerCount--;
                if (readerCount == 0) {
                    writeSemaphore.release(); // Last reader releases write access
                    printState(Thread.currentThread().getName(), "Last reader released write access");
                }
                readSemaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Utility method to print the state in table format
    private static synchronized void printState(String threadName, String action) {
        String writeSemaphoreState = writeSemaphore.availablePermits() == 1 ? "Unlocked" : "Locked";
        String readSemaphoreState = readSemaphore.availablePermits() == 1 ? "Unlocked" : "Locked";

        System.out.printf(
                "| %-10s | %-30s | %-13d | %-15s | %-15s |\n",
                threadName, action, readerCount, writeSemaphoreState, readSemaphoreState
        );

        // Print table header if it's the first print
        if (action.equals("Acquired write access")) {
            System.out.println("|------------|--------------------------------|---------------|-----------------|-----------------|");
        }
    }
}
