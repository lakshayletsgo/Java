package ExamCreation;

import java.io.FileWriter;
import java.util.Scanner;

public class ExamCreation_MCQ {
    public static void main() {
        Scanner sc= new Scanner(System.in);
        try {


        FileWriter f1=  new FileWriter("Question_MCQ.txt");
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the number of questions");
        int num1 = sc3.nextInt();
        for(int q=0;q<num1;q++){
        String []q1 = new String[6];
        System.out.println("Enter the question :");
        q1 [0] = sc1.nextLine();
        f1.write(q1[0]+":");
        System.out.println("Enter the choices: ");
        for (int i = 0; i < 4; i++) {
            q1[i + 1] = sc.nextLine();
            f1.write(q1[i+1]+":");

        }
        System.out.println("Enter the correct option: ");
        q1[5] = sc2.nextLine();
        f1.write(q1[5]+"\n");
    }
            f1.close();
        }catch (Exception e){
            System.out.println(e);
        }
}
}
