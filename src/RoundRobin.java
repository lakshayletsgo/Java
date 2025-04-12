import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.ArrayList;

public class RoundRobin {
    static class Process {
        int id;
        int arrivalTime;
        int burstTime;
        int remainingTime;
        int completionTime;
        int waitingTime;
        int turnAroundTime;

        public Process(int id, int arrivalTime, int burstTime) {
            this.id = id;
            this.arrivalTime = arrivalTime;
            this.burstTime = burstTime;
            this.remainingTime = burstTime;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of processes
        System.out.print("Enter the number of processes: ");
        int numProcesses = scanner.nextInt();

        // Read time quantum
        System.out.print("Enter the time quantum: ");
        int timeQuantum = scanner.nextInt();

        // Initialize processes
        Queue<Process> processQueue = new LinkedList<>();
        ArrayList<Process> allProcesses = new ArrayList<>();
        for (int i = 0; i < numProcesses; i++) {
            System.out.print("Enter arrival time for process " + (i + 1) + ": ");
            int arrivalTime = scanner.nextInt();
            System.out.print("Enter burst time for process " + (i + 1) + ": ");
            int burstTime = scanner.nextInt();
            Process process = new Process(i + 1, arrivalTime, burstTime);
            processQueue.add(process);
            allProcesses.add(process);
        }

        // Execute round robin scheduling
        int currentTime = 0;
        Queue<Process> readyQueue = new LinkedList<>();
        ArrayList<String> ganttChart = new ArrayList<>();
        ArrayList<Integer> ganttTimeMarkers = new ArrayList<>();
        ganttTimeMarkers.add(currentTime);

        while (!processQueue.isEmpty() || !readyQueue.isEmpty()) {
            // Move processes that have arrived to the ready queue
            while (!processQueue.isEmpty() && processQueue.peek().arrivalTime <= currentTime) {
                readyQueue.add(processQueue.poll());
            }

            if (readyQueue.isEmpty()) {
                currentTime++;
                ganttChart.add("Idle");
                ganttTimeMarkers.add(currentTime);
                continue;
            }

            Process currentProcess = readyQueue.poll();

            // Process runs for time quantum or remaining time
            int timeSlice = Math.min(timeQuantum, currentProcess.remainingTime);
            currentProcess.remainingTime -= timeSlice;
            ganttChart.add("P" + currentProcess.id);
            ganttTimeMarkers.add(currentTime + timeSlice);
            currentTime += timeSlice;

            // If process is not finished, put it back in the queue
            if (currentProcess.remainingTime > 0) {
                readyQueue.add(currentProcess);
            } else {
                currentProcess.completionTime = currentTime;
                currentProcess.turnAroundTime = currentProcess.completionTime - currentProcess.arrivalTime;
                currentProcess.waitingTime = currentProcess.turnAroundTime - currentProcess.burstTime;
            }
        }

        // Print Gantt chart in table format
        System.out.println("\nGantt Chart:");
        for (String entry : ganttChart) {
            System.out.print("|  " + entry + "  ");
        }
        System.out.println("|");
        for (int time : ganttTimeMarkers) {
            System.out.print(time + "      ");
        }
        System.out.println();

        // Print waiting time and turn around time for each process
        System.out.println("\nProcess Details:");
        for (Process p : allProcesses) {
            System.out.println("Process " + p.id + ": Waiting Time = " + p.waitingTime + ", Turnaround Time = " + p.turnAroundTime);
        }

        scanner.close();
    }
}
