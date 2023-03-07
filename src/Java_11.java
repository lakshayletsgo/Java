//Recursion
import java.util.Scanner;
public class Java_11 {
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return n*factorial(n-1);
    }
    public static int fibonacci(int a){
        if(a==0){
            return 0;
        }
        if(a==1){
            return 1;
        }
        return fibonacci(a-1)+fibonacci(a-2);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n= sc.nextInt();
        System.out.println("Factorial of "+n+" is "+factorial(n));
        System.out.println("Fibonacci series is :");
        for(int i=0;i<n;i++)
        System.out.print(fibonacci(i)+"\t");
    }
}
