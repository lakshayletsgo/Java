//If-else ladder and Switch case
import java.util.Scanner;

public class Java_5 {
    public static void main(String[]args){
        int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
//        This is if-else ladder
        if(b>a){
            System.out.println("b is greater than a");
        }else if(b>c){
            System.out.println("b is greater than c");
        }else{
            System.out.println("b is the smallest");
        }

//        This is switch case statement
        switch (d){
            case 1:
                System.out.println("You have entered 1");
                break;
            case 2:
                System.out.println("You have entered 2");
                break;
            default:
                System.out.println("This is a default statement");
        }
    }
}
