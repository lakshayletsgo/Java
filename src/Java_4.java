//Loops
import java.util.Scanner;
public class Java_4 {
    public static void main(String[]args){
       int a,b,c,d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

//      We loop for loop when we know everything i.e. the condition, the intialisation and the increment
        for(int i=0;i<a;i++){
            System.out.println("This is inside the for loop "+i);
        }

//        While loop is used only when we know the condition only
        int j = 0;
        while(j<b){
            System.out.println("This is inside while loop "+j);
            j++;
        }

//        In this the statement is exicuted at least one time because it checks the condition after one run
        int z = 0;
        do{
            System.out.println("This is inside the do while loop "+z);
            z++;
        }while (z<c);
    }
}
