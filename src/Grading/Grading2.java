package Grading;
import OnlineExam.*;
import ExamCreation.*;

import java.io.FileReader;
import java.util.Objects;
import java.util.Scanner;

public class Grading2 {
    public static int checkSubjective(String n){
        int number=0;
        if(n.length()>100){
            number = 2;
        }else {
            number=1;

        }return number;
    }
    public static void reportMaking(int q,int q2,int q3,int n,int n2,int n3){
        System.out.println("\n\nYour report\n\n");
        System.out.println("\t\t\tType\t\t\t\tTotal Question\t\t\tAnswered Correctly\t\t\tMarks Scored");
        System.out.println("\t\t\tMCQ Question\t\t\t"+q+"\t\t\t\t\t\t"+n+"\t\t\t\t\t\t\t"+n);
        System.out.println("\t\t\tObjectice Question\t\t"+q2+"\t\t\t\t\t\t"+n2+"\t\t\t\t\t\t\t"+n2);
        System.out.println("\t\t\tSubjective Question\t\t"+q3+"\t\t\t\t\t\t"+n3+"\t\t\t\t\t\t\t"+n3);
        System.out.println("\t\t\tTotal Marks\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+(n+n2+n3)+"\n\n\n");

    }

    public static void reportAnalyse(int q,int q2,int q3,int n,int n2,int n3){
        if(n<q){
            System.out.println("You are weak at MCQ-Type question");
        }else if(n==q){
            System.out.println("You are very good in MCQ type question");
        }
        if(n2<q2){
            System.out.println("You are weak in Objective-Type Question");
        } else if (n == q) {
            System.out.println("You are very good at Objective-Type Question");
        }
        if(n3<q3){
            System.out.println("You are weak at Subjective-Type Question");
        } else if (n3 == q3) {
            System.out.println("You are very good at Subjective-Type Question");
        }
    }
    public static void main() {
        int x = 0;
        int x2 = 0;
        int y = 5;
        int y2 = 3;
        int y3= 1;
        int z1= 0;
        int z2= 0;
        int z3= 0;
        int Mcq_ques = 0;
        int Objective_ques = 0;
        int Subjective_ques = 0;

        int MCQ_marks = 0;
        int Objective_marks = 0;
        int Subjective_marks = 0;
        try {
            FileReader f1 = new FileReader("Question_MCQ.txt");
            FileReader f2 = new FileReader("Question_Objective.txt");
            FileReader f3 = new FileReader("Question_Subjective.txt");
            FileReader f4 = new FileReader("studentResponse.txt");

            Scanner f11 =  new Scanner(f1);
            Scanner f12 = new Scanner(f2);
            Scanner f13 = new Scanner(f3);
            Scanner f14 = new Scanner(f4);
            String MCQ_Question = f11.nextLine();
            String[] parts_MCQ_Question = MCQ_Question.split(":");
            String Objective_Question = f12.nextLine();
            String[] parts_Objective_Question = Objective_Question.split(":");
            String Subjective_Question = f13.nextLine();
            String[] parts_Subjective_Question = Subjective_Question.split(":");
            String studentResponse = f14.nextLine();
            String[] parts_StudentResponse = studentResponse.split(":");

            while (true){
                if(Objects.equals(parts_MCQ_Question[y], parts_StudentResponse[x])){
//                System.out.println("SuccessFull");
                    MCQ_marks ++;
                }
                x++;
//                System.out.println(x+"MCQ");
                y = y+6;
                z1++;
                Mcq_ques++;
                if(y>= parts_MCQ_Question.length){
//                    x++;
                    break;
                }
            }
            while (true){
                if(Objects.equals(parts_Objective_Question[y2], parts_StudentResponse[x])){
//                System.out.println("SuccessFull");
//                    System.out.println("Q1");
                    Objective_marks++;
                }
                x++;
//                System.out.println(x);
                y2 = y2+4;
                z2++;
                Objective_ques++;
//                System.out.println(y2);
                if(y2>= parts_Objective_Question.length){
                    break;
                }
            }
            while (true){
                if(checkSubjective(parts_StudentResponse[x])==1){
//                System.out.println("SuccessFull");
                    Subjective_marks++;
                }else {
                    Subjective_marks = Subjective_marks+2;
                }
                x++;
                y3 = y3+2;
                z3++;
                Subjective_ques++;
//                System.out.println("Ok");
                if(y2>= parts_Subjective_Question.length){
                    break;
                }
            }


            f1.close();
            f2.close();
            f3.close();
            f4.close();
        }catch (Exception e){
            System.out.println("Exception in main "+e);
            e.printStackTrace();
        }
        int total_Marks = MCQ_marks + Objective_marks+Subjective_marks;
//        System.out.println(MCQ_marks);
//        System.out.println(Objective_marks);
//        System.out.println(Subjective_marks);
        System.out.println("Total Marks:"+total_Marks);
//        System.out.println(z1+" \t "+z2+"\t"+z3);
//
//        System.out.println("You have scored "+MCQ_marks+" in MCQ Question ");
//        System.out.println("You have answered "+MCQ_marks+" MCQ Questions correctly");
//        System.out.println("You have scored "+Objective_marks+" in Objective Question ");
//        System.out.println("You have answered "+Objective_marks+" Objective correctly");
//        System.out.println("You have scored "+Subjective_marks+" in Subjective Question ");
//        System.out.println("You have answered "+Subjective_marks+" Subjective correctly");

        reportMaking(Mcq_ques,Objective_ques,Subjective_ques,MCQ_marks,Objective_marks,Subjective_marks);

        reportAnalyse(Mcq_ques,Objective_ques,Subjective_ques,MCQ_marks,Objective_marks,Subjective_marks);

//        System.out.println("No of MCQ Questions: "+Mcq_ques);
//        System.out.println("No of Objective Questions: "+Objective_ques);
//        System.out.println("No of Subjective Questions: "+Subjective_ques);
//        return total_Marks;
    }
}
