//Nested try-catch
// This is a program that checks if the user entered a valid index of the array
import java.util.Scanner;
public class Java_35 {
    public static void main(String[] args) {
         int [] arr = new int[5];
         arr[0]  = 10;
         arr[1]  = 10;
         arr[2]  = 10;
         arr[4]  = 10;
         arr[3]  = 10;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of arrray");
        boolean flag  = true;
        while(flag){
//        If there is an error in the inside try and catch it will focus on it first then the outside
            try {
                int n = sc.nextInt();
//                System.out.println("This is outside try and catch block with no error ");
            try {
                System.out.println("You have asked for "+arr[n]);
                flag = false;
            }catch (ArrayIndexOutOfBoundsException e1){
                System.out.println("You have entered a value that is out of length");
                System.out.println("This is inside error try and catch block ");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }}
}
