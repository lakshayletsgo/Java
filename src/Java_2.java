//Scanner(Taking input from the user) and Operations in Java
import java.util.Scanner;
public class Java_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in); //This will take the input from the user and store it in the sc variable
        int a = sc.nextInt(); //This will extract the required input from the sc variable
// The number of input the user give depends on how many times this function is called

        System.out.println(a); //This will print the value user have input

//        Operations in java
        int b,c;
        b= sc.nextInt();
        c = sc.nextInt();
        System.out.println("Addition "+(b+c));
        System.out.println("Subtraction "+(b-c));
        System.out.println("Multiplication "+ b*c);
        System.out.println("Division "+ b/c);
    }

}
