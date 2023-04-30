package OnlineExam;
import ExamCreation.*;

import java.util.Scanner;

public class OnlineExam {
    public static void main(String[] args) {
        System.out.println("Enter your choice of question: \n 1.MCQ\n 2.Subjective\n 3.Objective\n 4.Exit");
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        int n = sc.nextInt();
        while(!(n==4)){
            if(n==1){
                ExamCreation_MCQ.main();
            } else if (n == 2) {
                    ExamCreation_Subjective.main();
            } else if (n == 3) {
                    ExamCreation_Objective.main();

            }
            System.out.println("Enter your choice of question: \n 1.MCQ\n 2.Subjective\n 3.Objective\n 4.Exit");
            n = sc.nextInt();

        }
        System.out.println("Question Paper Ready!!");

    }
}
