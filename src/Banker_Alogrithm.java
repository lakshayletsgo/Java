import java.util.Scanner;

class BankersAlgorithm {
    // Variables
    private int numberOfProcesses; // Number of processes
    private int numberOfResources; // Number of resources
    private int[][] maximum; // Maximum demand of each process
    private int[][] allocation; // Resources allocated to each process
    private int[][] need; // Remaining needs of each process
    private int[] available; // Available instances of each resource

    public void input() {
        Scanner sc = new Scanner(System.in);

        // Input number of processes and resources
        System.out.print("Enter the number of processes: ");
        numberOfProcesses = sc.nextInt();

        System.out.print("Enter the number of resources: ");
        numberOfResources = sc.nextInt();

        maximum = new int[numberOfProcesses][numberOfResources];
        allocation = new int[numberOfProcesses][numberOfResources];
        need = new int[numberOfProcesses][numberOfResources];
        available = new int[numberOfResources];

        // Input maximum matrix
        System.out.println("Enter the Maximum matrix:");
        for (int i = 0; i < numberOfProcesses; i++) {
            for (int j = 0; j < numberOfResources; j++) {
                maximum[i][j] = sc.nextInt();
            }
        }

        // Input allocation matrix
        System.out.println("Enter the Allocation matrix:");
        for (int i = 0; i < numberOfProcesses; i++) {
            for (int j = 0; j < numberOfResources; j++) {
                allocation[i][j] = sc.nextInt();
            }
        }

        // Input available resources
        System.out.println("Enter the Available resources:");
        for (int j = 0; j < numberOfResources; j++) {
            available[j] = sc.nextInt();
        }

        // Calculate Need matrix
        for (int i = 0; i < numberOfProcesses; i++) {
            for (int j = 0; j < numberOfResources; j++) {
                need[i][j] = maximum[i][j] - allocation[i][j];
            }
        }

        sc.close();
    }

    public boolean isSafeState() {
        boolean[] finished = new boolean[numberOfProcesses];
        int[] work = available.clone();
        int[] safeSequence = new int[numberOfProcesses];
        int count = 0;

        System.out.println("\nStep-by-step resource allocation:");

        while (count < numberOfProcesses) {
            boolean found = false;

            for (int i = 0; i < numberOfProcesses; i++) {
                if (!finished[i]) {
                    boolean canAllocate = true;

                    // Check if need[i] <= work
                    for (int j = 0; j < numberOfResources; j++) {
                        if (need[i][j] > work[j]) {
                            canAllocate = false;
                            break;
                        }
                    }

                    if (canAllocate) {
                        // Allocate resources to this process
                        System.out.println("\nAllocating resources to P" + i);
                        for (int j = 0; j < numberOfResources; j++) {
                            work[j] += allocation[i][j];
                        }
                        System.out.print("Available resources after allocation: ");
                        for (int j = 0; j < numberOfResources; j++) {
                            System.out.print(work[j] + " ");
                        }
                        System.out.println();

                        safeSequence[count++] = i;
                        finished[i] = true;
                        found = true;
                    }
                }
            }

            // If no process can be allocated, the system is in an unsafe state
            if (!found) {
                System.out.println("\nThe system is in an unsafe state.");
                return false;
            }
        }

        // Check if available matches the total maximum resources
        System.out.println("\nFinal available resources:");
        for (int j = 0; j < numberOfResources; j++) {
            System.out.print(work[j] + " ");
        }
        System.out.println();

        System.out.print("\nThe system is in a safe state.\nSafe sequence: ");
        for (int i = 0; i < numberOfProcesses; i++) {
            System.out.print("P" + safeSequence[i]);
            if (i != numberOfProcesses - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();

        return true;
    }}
public class Banker_Alogrithm {
    public static void main(String[] args) {
        BankersAlgorithm bankers = new BankersAlgorithm();

        // Input the details of the system
        bankers.input();

        // Check if the system is in a safe state
        bankers.isSafeState();
    }
}
