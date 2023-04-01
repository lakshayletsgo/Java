//Practice
import java.util.Scanner;
public class Java_39 {
    public static void main(String[] args) {
//        This is logical error
//        int age=10;
//        int year_born = 30-10;


//      This is runtime error
//      System.out.println(6/0);

//        try {
//            Scanner sc= new Scanner(System.in);
//            int a=10;
//            int c = sc.nextInt();
//            System.out.println(a/c);
//        }
//        catch (ArithmeticException e){
//            System.out.println("Haha");
//        }
//        catch (IllegalArgumentException e){
//            System.out.println("Hehe");
//        }


        int [] arr = {10,20,30,10,40};
//        System.out.println("Enter the index you want ");
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int i=0;
        while(flag && i<5){
            try {
                System.out.println("Enter the index you want : ");
                int x = sc.nextInt();
                System.out.println("The value at the index you put was "+arr[x]);
                break;
            }catch (Exception  e){
                System.out.println("You have entered wrong index");
                i++;
            }
            if(i>=5){
                System.out.println("Error");
            }
        }
    }
}
