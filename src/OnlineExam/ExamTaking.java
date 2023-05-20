package OnlineExam;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class ExamTaking {


//        return " " ;

    public static void main() {
        int y=0;
        try {
            FileWriter fw = new FileWriter("studentResponse.txt");


            Scanner sc5 = new Scanner(System.in);
//        Scanner sc = new Scanner(System.in);
            int n = 1;
            String studentRs;

                File f2 = new File("Question_MCQ.txt");
//            String [] rs = new String[];
//            Scanner ans2= new Scanner(fw);
                Scanner ques2 = new Scanner(f2);
                String quess2 = ques2.nextLine();
                String[] parts2 = quess2.split(":");
                while (y<parts2.length) {
                    System.out.print("Question " + n + ":");
                    n++;
                    System.out.println(parts2[y]);
                    y++;
                    for (int o = 0; o < 4; o++) {
                        System.out.println((o + 1) + "." + parts2[y]);
                        y++;
                    }
                    y++;
                    studentRs = sc5.nextLine();
                    fw.write(studentRs+":");
//                    y=y+5;
//                String []srs5
                }
//                fw.close();
//                sc5.close();
//                fw.close();
                ques2.close();


            try {
//                FileWriter fw = new FileWriter("studentResponse.txt");
                File f3 = new File("Question_Objective.txt");
                Scanner ques3 = new Scanner(f3);
                String quess3 = ques3.nextLine();
                int x =0;
                String[] parts3 = quess3.split(":");
                while (x<parts3.length) {
                    ;
                    System.out.print("Question " + n + ":");
                    n++;
                    System.out.println(parts3[x]);
                    x++;
                    for (int o = 0; o <2; o++) {
                        System.out.println((o + 1) + "." + parts3[x]);
                        x++;
                    }
                    x++;
                    studentRs = sc5.nextLine();
                    fw.write(studentRs+":");
//                ques3.skip("\n");
                }
//                fw.close();
                ques3.close();

            } catch (Exception e) {
                System.out.println("There is an exception in getting value of Obecjtive Questions "+e);
                e.printStackTrace();
            }


            try {
                File f1 = new File("Question_Subjective.txt");
//                FileWriter fw = new FileWriter("studentResponse.txt");
                Scanner ques = new Scanner(f1);
                while (ques.hasNextLine()) {
                    String quess = ques.nextLine();
                    String[] parts = quess.split(":");
                    System.out.print("Question " + n + ":");
//                n++;
                    System.out.println(parts[0]);
                    for (int o = 0; o < parts.length - 2; o++) {
                        System.out.println((o + 1) + "." + parts[o + 1]);
                    }
                    studentRs = sc5.nextLine();
                    fw.write(studentRs+":");
//                ques.skip("\n");

                }
                ques.close();
            } catch (Exception e) {
                System.out.println("There is an exception in getting value of Subjective Questions "+e);
            }
//        return n;
            fw.close();
        }catch (Exception e){
            System.out.println("Exception in writing response  "+ e);
        }
    }
}