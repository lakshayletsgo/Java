//Custom Exceptions
//We can make our custom exceptions and throw them
// To make our custom we have to ovveride already written exceptions
// If we don't specify the exception method then it will run the toString method
// e.printStackTrace will tell the error and in which line

//So Basically we have to declare a class with name and extends it with Exception
// Then we have to ovveride the toString and getMessage methods and whenever we throw that class name, it is an exception and we get the toString method first

//At the end what is thrown is an error so it is handled in the catch block
import java.util.Scanner;
class myException extends Exception{
    @Override
    public String toString() {
        return "I am toString";
    }

    @Override
    public String getMessage() {
        return "I am getMessage";
    }
}
public class Java_36 {
    public static void main(String[] args) {
        int a ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        if(a<10){
            try {
                throw new myException();
            }catch (Exception e){
                System.out.println(e);
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("Finished");
            }
        }
    }
}
