//Insertion Sort
//In this we first sort the 1 length of array and then it sort 2 length of the array till the length of the array
//It sorts the array with time complexity for best case 0(N) and worst case 0(N*N)
import java.util.Arrays;
public class DSA_15 {
    public static void main(String[] args) {
        int[]arr = {2,5,1,4,8,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
        }
    }
    static void swap(int[]arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
