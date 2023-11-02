//Count Sort
//It works on small elements
//For this we create a new array with number of element equal to the max of the arr
//After this we make a freq array in which the index where the element was present is increment
//After this we reArrange the array
import java.util.Arrays;

public class DSA_64 {
    public static void main(String[] args) {
        int[]arr = {4,8,1,5,2,7,2,8};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void countSort(int[]arr){
        if(arr.length==1||arr.length==0){
            return;
        }
        int max=arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        int []countArray = new int[max+1];
        for(int num:arr){
            countArray[num]++;
        }
        int index= 0;
        for(int i=0;i<max;i++){
            while (countArray[i]>0){
                arr[index]=i;
                index++;
                countArray[i]--;
            }

        }
    }

}
