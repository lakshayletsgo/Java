package OnlineExam;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class ExamTaking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File f1 = new File("Question_Subjective.txt");
            File f2 = new File("Question_MCQ.txt");
            File f3 = new File("Question_Objective.txt");
            Scanner ques = new Scanner(f1);
            Scanner ques2 = new Scanner(f2);
            Scanner ques3 = new Scanner(f3);
            while(ques.hasNextLine()||ques3.hasNextLine()||ques2.hasNextLine()){
                String quess = ques.nextLine();
                String quess2 = ques2.nextLine();
                String quess3 = ques3.nextLine();
                String[] parts = quess.split(":");
                String[] parts2 = quess2.split(":");
                String[] parts3 = quess3.split(":");
                System.out.print("Question: ");
                System.out.println(parts[0]);
                for(int o=0;o<parts.length-2;o++){
                    System.out.println((o+1)+"."+parts[o+1]);
                }
                System.out.print("Question: ");
                System.out.println(parts2[0]);
                for(int o=0;o<parts2.length-2;o++){
                    System.out.println((o+1)+"."+parts2[o+1]);
                }
                System.out.print("Question: ");
                System.out.println(parts3[0]);
                for(int o=0;o<parts3.length-1;o++){
                    System.out.println((o+1)+"."+parts3[o+1]);
                }
                ques.skip("\n");
                ques2.skip("\n");
                ques3.skip("\n");
            }
            ques.close();
            ques3.close();
            ques2.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
