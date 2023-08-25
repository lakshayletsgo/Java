import java.util.Arrays;
import java.util.Scanner;

public class ClassJava_55 {
    public static void main(String[] args) {
        System.out.println("Enter the matrix: ");
        int [][]arr =  new int[3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your Array is: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
        int c =0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]!=0){
                    c++;
                }
            }
        }
        int [][]sol = new int[c][3];
        int k=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i][j]!=0){
                        sol[k][0] = i;
                        sol[k][1] = j;
                        sol[k][2]= arr[i][j];
                        k++;
                    }

            }
        }
        System.out.println("Number of elements are: "+c);
        System.out.println("Array is : ");
        for(int i=0;i<sol.length;i++){

            System.out.println( Arrays.toString(sol[i]));
        }

    }
}
