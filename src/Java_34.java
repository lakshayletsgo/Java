// Handling Specific Exception
// This is used to handle specific exception which means an exception we know that would occur and we can counter it
import java.util.Scanner;
public class Java_34 {
    public static void main(String[] args) {
        int [] marks = new int[5];
        marks[0] = 98;
        marks[1] = 91;
        marks[2] = 92;
        marks[3] = 64;
        marks[4] = 69;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index you want : ");
        int n = sc.nextInt();
        System.out.println("Enter the number you want to divide with: ");
        int num = sc.nextInt();
        try {
        System.out.println("Your number selected is "+marks[n]);
        System.out.println("Your number is divided and remains "+marks[n]/num);
             }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("You have entered the index which is out of length");

        }
     catch (ArithmeticException e2){
         System.out.println("You have entered a number that can't divide the number at the index");
     }
     catch (Exception e){
            System.out.println("There is an error ");
            System.out.println("Error: "+e);
        }

    }
}
