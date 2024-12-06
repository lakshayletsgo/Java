import java.util.concurrent.Semaphore;

public class Dining {

    private static final int TOTAL_PHILOSOPHERS = 5; // Total number of philosophers
    private final Semaphore[] utensils = new Semaphore[TOTAL_PHILOSOPHERS]; // Semaphore for chopsticks
    private final Semaphore outputLock = new Semaphore(1); // Mutex for synchronized console output
    private static final int MAX_ROUNDS = 3; // Maximum thinking + eating cycles

    // Inner class representing a philosopher
    class Philosopher extends Thread {
        private final int id;
        private int roundCount = 0; // Keeps track of completed cycles

        Philosopher(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            try {
                while (roundCount < MAX_ROUNDS) { // Perform actions for a defined number of cycles
                    think();
                    acquireUtensils();
                    dine();
                    releaseUtensils();
                    roundCount++;
                }
            } catch (InterruptedException e) {
                System.out.println("Philosopher " + id + " encountered an interruption.");
            }
        }

        private void think() throws InterruptedException {
            outputLock.acquire();
            System.out.printf("| %-15s | %-12s | %-12s | %-12s |\n", "Philosopher " + id, "-", "-", "Thinking");
            outputLock.release();
            Thread.sleep((long) (Math.random() * 1000));
        }

        private void acquireUtensils() throws InterruptedException {
            int left = id;
            int right = (id + 1) % TOTAL_PHILOSOPHERS;

            // Acquire left utensil
            utensils[left].acquire();
            outputLock.acquire();
            System.out.printf("| %-15s | %-12s | %-12s | %-12s |\n", "Philosopher " + id, left, "Acquired", "Left Utensil");
            outputLock.release();

            // Acquire right utensil
            utensils[right].acquire();
            outputLock.acquire();
            System.out.printf("| %-15s | %-12s | %-12s | %-12s |\n", "Philosopher " + id, right, "Acquired", "Right Utensil");
            outputLock.release();
        }

        private void dine() throws InterruptedException {
            outputLock.acquire();
            System.out.printf("| %-15s | %-12s | %-12s | %-12s |\n", "Philosopher " + id, "-", "Busy", "Dining");
            outputLock.release();
            Thread.sleep((long) (Math.random() * 1000));
        }

        private void releaseUtensils() {
            int left = id;
            int right = (id + 1) % TOTAL_PHILOSOPHERS;

            // Release left utensil
            utensils[left].release();
            outputLock.acquireUninterruptibly();
            System.out.printf("| %-15s | %-12s | %-12s | %-12s |\n", "Philosopher " + id, left, "Available", "Left Released");
            outputLock.release();

            // Release right utensil
            utensils[right].release();
            outputLock.acquireUninterruptibly();
            System.out.printf("| %-15s | %-12s | %-12s | %-12s |\n", "Philosopher " + id, right, "Available", "Right Released");
            outputLock.release();
        }
    }

    public void initiateDining() {
        // Initialize semaphores for utensils
        for (int i = 0; i < TOTAL_PHILOSOPHERS; i++) {
            utensils[i] = new Semaphore(1);
        }

        // Print table header for logging
        System.out.printf("| %-15s | %-12s | %-12s | %-12s |\n", "Philosopher", "Utensil", "Status", "Activity");
        System.out.println("|-----------------|--------------|--------------|--------------|");

        // Create and start philosopher threads
        for (int i = 0; i < TOTAL_PHILOSOPHERS; i++) {
            new Philosopher(i).start();
        }
    }

    public static void main(String[] args) {
        Dining simulation = new Dining();
        simulation.initiateDining();
    }
}
