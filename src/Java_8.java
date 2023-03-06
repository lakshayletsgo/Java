//Arrays
import java.util.Scanner;
public class Java_8 {
    public static void main(String[]args){
        int x[] = new int[4]; //Declaration of Arrays
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            x[i] = sc.nextInt();
        }
        for(int i=0;i<4;i++){
            System.out.print(x[i]);
        }
        System.out.println();

//        This is easier way of printing a array
        for(int element:x){
            System.out.print(element);
        }
        System.out.println();

//        2-D array
        int y[][] = new int[2][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                y[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(y[i][j]);

            }
            System.out.println();
        }
    }
}
