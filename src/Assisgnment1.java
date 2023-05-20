import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Assisgnment1 {
//    private int n;

    public  static void IllegalException(int n){
        if(n<0){
            System.out.println("This is Illegal Exception");
        }else{
            int name = n;
        }
    }
    public static void main(String[] args) {
        try{
            System.out.println("Enter the number: ");
            Scanner sc = new Scanner(System.in);
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();

            System.out.println("Enter 1 to get arithmetic exception, 2 for getting array exception ,3 for getting Number Format Exception, 4 for Null Pointer Exception and 5 for Illegal Argument Exception ");
            int n = sc.nextInt();
            if(n==1){
                System.out.println(a1/0);
            } else if (n==2) {
                int []arr = new int[2];
                arr[2] = a2;
            } else if (n==3) {
                int a11 = Integer.parseInt("Lakshay");
            } else if (n == 4) {
                String na = null;
                if(na.equals("Lakshay")){
                    System.out.println("XYZ");
                }
            } else if (n == 5) {
                IllegalException(-1);
            }
        }
        catch (ArithmeticException A1){
            System.out.println("Arithmetic Exception caught");
        }
        catch (ArrayIndexOutOfBoundsException A2){
            System.out.println("Array Index out of bound Exception caught");
        }catch (NumberFormatException A3){
            System.out.println("Number Format Exception caught");
        }catch (NullPointerException A4){
            System.out.println("Null Pointer Exception caught");
        }catch (IllegalArgumentException A5){
            System.out.println("Illegal Argument Exception caught");
        }

        catch (Exception e){
            System.out.println("Exception in main method");
        }
        try{
            FileReader f1 = new FileReader("Example.txt");
            System.out.println(f1.read());
            f1.close();
//            f1.close;
        }catch (IOException A7){
            System.out.println("IO Exception caught");
        }
    }
}
