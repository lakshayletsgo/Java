import java.io.*;
import java.util.Scanner;

class Bus {
    String busNo;
    String driverName;
    String arrivalTime;
    String departure;
    String from;
    String to;
}

public class Java_Project {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Bus[] bus = new Bus[10];
        for (int i = 0; i < 10; i++) {
            bus[i] = new Bus();
        }
        int choice;
        do {
            System.out.println("1. Add Bus Details");
            System.out.println("2. Display Bus Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addBus(bus);
                    break;
                case 2:
                    displayBus(bus);
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 3);
    }

    private static void addBus(Bus[] bus) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("bus.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter pw = new PrintWriter(bw);
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter Bus No: ");
            bus[i].busNo = sc.next();
            System.out.print("Enter Driver Name: ");
            bus[i].driverName = sc.next();
            System.out.print("Enter Arrival Time: ");
            bus[i].arrivalTime = sc.next();
            System.out.print("Enter Departure Time: ");
            bus[i].departure = sc.next();
            System.out.print("From: ");
            bus[i].from = sc.next();
            System.out.print("To: ");
            bus[i].to = sc.next();
            pw.println(bus[i].busNo + "," + bus[i].driverName + "," + bus[i].arrivalTime + "," + bus[i].departure + "," + bus[i].from + "," + bus[i].to);
        }
        pw.close();
        bw.close();
        fw.close();
    }

    private static void displayBus(Bus[] bus) throws IOException {
        FileReader fr = new FileReader("bus.txt");
        BufferedReader br = new BufferedReader(fr);
        String s;
        while ((s = br.readLine()) != null) {
            String[] arrOfStr = s.split(",");
            for (int i = 0; i < arrOfStr.length; i++) {
                switch (i) {
                    case 0:
                        System.out.println("Bus No: " + arrOfStr[i]);
                        break;
                    case 1:
                        System.out.println("Driver Name: " + arrOfStr[i]);
                        break;
                    case 2:
                        System.out.println("Arrival Time: " + arrOfStr[i]);
                        break;
                    case 3:
                        System.out.println("Departure Time: " + arrOfStr[i]);
                        break;
                    case 4:
                        System.out.println("From: " + arrOfStr[i]);
                        break;
                    case 5:
                        System.out.println("To: " + arrOfStr[i]);
                        break;
                }
            }
            System.out.println("");
        }
        br.close();
        fr.close();
    }
}