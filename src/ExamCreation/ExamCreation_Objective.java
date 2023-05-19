package ExamCreation;

import java.io.FileWriter;
import java.util.Scanner;

public class ExamCreation_Objective {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 =new Scanner(System.in);
        try {
            FileWriter f1 = new FileWriter("Question_Objective.txt");
            System.out.println("Enter the number of questions: ");
            int num2 =sc2.nextInt();
            for(int i=0;i<num2;i++){
                System.out.println("Enter the question :");
                String q = sc.nextLine();
                f1.write(q+":");
                System.out.println("Enter the choices :");
            String[] ch = new String[2];
            ch[0] = sc.nextLine();
            f1.write(ch[0]+":");
            ch[1] = sc.nextLine();
            f1.write(ch[1]+":");
            System.out.println("Enter the correct answer :");
            String cr = sc.nextLine();
            f1.write(cr+":");

            }
            f1.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}