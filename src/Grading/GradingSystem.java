//package Grading;
//import ExamCreation.*;
//import OnlineExam.*;
//
//import java.io.File;
//import java.util.Objects;
//import java.util.Scanner;
//
//public class GradingSystem {
//    public static void main() {
//        int numbers_MCQ = 0;
//        int numbers_Subjective = 0;
//        int numbers_Objective = 0;
//        int y = 0;
//        try {
//
//
//            File f1 = new File("Question_MCQ.txt");
//            File f2 = new File("Question_Objective.txt");
//            File f3 = new File("Question_Subjective.txt");
//            File f4 = new File("studentResponse.txt");
//            Scanner qM = new Scanner(f1);
//            Scanner qS = new Scanner(f2);
//            Scanner qO = new Scanner(f3);
//            Scanner sR = new Scanner(f4);
////            if(f1=='\n')
//            while(qM.hasNextLine()){
//                int x =5;
//                while(qM.hasNextLine()){
//                    String entireQuestionMCQ = qM.nextLine();
//                    if(entireQuestionMCQ.contains("skip")){
////                        String[] partsMCQ = entireQuestionMCQ.split(":");
//                        continue;
//                    }
//                    String[] partsMCQ = entireQuestionMCQ.split(":");
//                    String ans_MCQ = partsMCQ[x];
//
////                System.out.println(ans_MCQ);
//                    String studentResM = sR.next();
//                    String [] partsRes = studentResM.split(":");
//                if(Objects.equals(ans_MCQ, partsRes[y])){
////                    System.out.println(partsMCQ[5]);
//                    numbers_MCQ = 4;
//                    x = x+5;
//                    System.out.println(x);
//                    y  ++;
//                    System.out.println(numbers_MCQ);
//                } else if (!Objects.equals(ans_MCQ, partsMCQ[x])) {
//                    y = y+1;
//                    numbers_MCQ--;
////                    qM.skip("\n");
//                    System.out.println(numbers_MCQ);
//                }
//                }
//            }
//            System.out.println(numbers_MCQ+" Outside");
//            qO.close();
//            qM.close();
//            qS.close();
//            sR.close();
//        }catch (Exception e){
//            System.out.println("There is error in main code   "+e);
//            e.printStackTrace();
//        }
//        System.out.println(numbers_MCQ);
//    }
//}