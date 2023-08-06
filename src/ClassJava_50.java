import java.util.Scanner;

public class ClassJava_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int j = 0;j<arr.length;j++){
            if(max<arr[j]){
                max = arr[j];
            }
            if(min>arr[j]){
                min = arr[j];
            }
        }
        System.out.println("The Difference of the max and min is : "+(max-min));

    }
}




