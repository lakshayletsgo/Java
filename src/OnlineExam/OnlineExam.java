package OnlineExam;
import ExamCreation.*;

import java.util.*;

public class OnlineExam {
    public static void main() {
        System.out.println("Enter your choice of question: \n 1.MCQ\n 2.Subjective\n 3.Objective\n 4.Exit");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while(!(n==4)){
            if(n==1){
                ExamCreation_MCQ.main();
            } else if (n == 2) {
                ExamCreation_Subjective.main();
            } else if (n == 3) {
                ExamCreation_Objective.main();
            }else{
                System.out.println("You have entered wrong choice");
            }
            System.out.println("Enter your choice of question: \n 1.MCQ\n 2.Subjective\n 3.Objective\n 4.Exit");
            n = scanner.nextInt();

        }
        System.out.println("Question Paper Ready!!\n\n\n");
//        scanner.close();
    }
}
