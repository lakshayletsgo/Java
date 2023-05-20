package ExamCreation;

import java.io.FileWriter;
import java.util.Scanner;

public class ExamCreation_Subjective {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2= new Scanner(System.in);
        try {

            FileWriter f1 = new FileWriter("Question_Subjective.txt");
            System.out.println("Enter the number of question: ");
            int num2 = sc2.nextInt();
            for(int j=0;j<num2;j++){
                System.out.println("Enter the question: ");
                String q = sc.nextLine();
                f1.write(q+":");
                System.out.println("Enter the length of the question :");
                int len = sc1.nextInt();
                f1.write(len+":");}
            f1.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}