// Throw and Throws
//Agr ham exception throws kar dete hai toh hame usse handle karna hi padega class ya method ke andar varna error dega
import java.util.Scanner;
class myException1 extends Exception{
    @Override
    public String toString() {
        return "You can't give a negative number as a dimension";
    }

    @Override
    public String getMessage() {
        return "You can't give a negative number as a dimension";
    }
}
public class Java_37 {
    public static double areaCircle(int r) throws myException1{
        if(r<0){
            throw new myException1();
        }
        return Math.PI*r*r;
    }
    public static int Divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
//        try {
//
//        }catch (Exception e){
//        System.out.println(e);}
//        int c = Divide(2, 0);
        Scanner sc= new Scanner(System.in);
        int r = sc.nextInt();
       try
       {
        System.out.println("Area of the circle is "+areaCircle(r));
    }catch (Exception e){
           System.out.println(e);
//           e.printStackTrace();
       }
    }
}
