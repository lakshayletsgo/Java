package OnlineExam;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ExamTaking {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        try {
            File f2 = new File("Question_MCQ.txt");
            Scanner ques2 = new Scanner(f2);
            while(ques2.hasNextLine()){
                String quess2 = ques2.nextLine();
                String[] parts2 = quess2.split(":");
                System.out.print("Question: ");
                System.out.println(parts2[0]);
                for(int o=0;o<parts2.length-2;o++){
                    System.out.println((o+1)+"."+parts2[o+1]);
                }
//                ques2.skip("\n");
            }
            ques2.close();
        }catch (Exception e){
            System.out.println("There is an exception in getting value of MCQ Questions "+e);
        }
        try{
            File f3 = new File("Question_Objective.txt");
            Scanner ques3 = new Scanner(f3);
            while (ques3.hasNextLine()){
                String quess3 = ques3.nextLine();
                String[] parts3 = quess3.split(":");
                System.out.print("Question: ");
                System.out.println(parts3[0]);
                for(int o=0;o<parts3.length-1;o++){
                    System.out.println((o+1)+"."+parts3[o+1]);
                }
//                ques3.skip("\n");
            }
            ques3.close();

        }catch (Exception e){
            System.out.println("There is an exception in getting value of Obecjtive Questions");
        }
        try{
            File f1 = new File("Question_Subjective.txt");
            Scanner ques = new Scanner(f1);
            while (ques.hasNextLine()){
                String quess = ques.nextLine();
                String[] parts = quess.split(":");
                System.out.print("Question: ");
                System.out.println(parts[0]);
                for(int o=0;o<parts.length-2;o++){
                    System.out.println((o+1)+"."+parts[o+1]);
                }
//                ques.skip("\n");

            }
            ques.close();
        }catch (Exception e){
            System.out.println("There is an exception in getting value of Subjective Questions");
        }
    }
}
