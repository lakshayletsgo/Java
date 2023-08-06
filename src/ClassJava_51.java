import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ClassJava_51 {
    public static void main(String[] args) {
        int []arr = {3,7,1,9,3,6,1,2,4,10};
        System.out.println(Arrays.toString(evenIndex(arr)));
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                System.out.print(arr[i]);
            }
        }

        System.out.println(Arrays.toString(reverseOrder(arr)));
        System.out.println(Arrays.toString(firstLast(arr)));
    }
    static int[] evenIndex(int []arr){
        int []newArr = new int[arr.length/2];
        int n=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                newArr[n] = arr[i];
                n++;
            }
        }
        return newArr;
    }
    static int[] reverseOrder(int[]arr){
        int [] newArr= new int[arr.length];
        int n=0;
//        for(int i=0;i<arr.length;i++){
            for(int j= newArr.length-1;j>=0;j--){
                newArr[n]=arr[j];
                n++;
            }
//        }
        return newArr;
    }
    static int[] firstLast(int []arr){
        return new int[]{arr[0],arr[arr.length-1]};

    }
}


