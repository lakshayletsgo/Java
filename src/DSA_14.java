import java.util.Arrays;

//Selection Sort
//In this we first find the largest element then we place it at the end and then check in the remaing array the largerst similarly we perform the same function
//Worst and best case has same time complexity 0(N*N)
//It is not stable sorting
public class DSA_14 {
    public static void main(String[] args) {
        int[]arr = {4,2,6,12,7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[]arr){
        for(int i=0;i<arr.length;i++){
            int last= arr.length-i-1;
            int max = getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    static int getMaxIndex (int []arr,int start,int last){
        int max = start;
        for(int i=start;i<=last;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int []arr,int max,int last){
        int temp = arr[max];
        arr[max] = arr[last];
        arr[last] = temp;
    }
}
