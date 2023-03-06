//Methods
import java.util.Scanner;
public class Java_9 {
    public static void printHello(){
        System.out.println("Hello Function 1!");
    }
    public static void printNumber(int a){
        System.out.println(a);
    }
    public static int returnSum(){
        int a =6;
        int b =6;
        return a+b;
    }
    public static int returnMultipy(int a, int b){
        return a*b;
    }
    public static void main(String[]args){
         int a,b,c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        printHello();
        printNumber(a);
        System.out.println(returnSum());
        System.out.println(returnMultipy(b,c));

    }
}
