//Cyclic Sort
//We use the cyclic sort when the elements are in the range of the length of array(Jitne elements value utni iski length)
//We swap the element with its right place and again check if it is at its correct position
//We swap untill the length of the array
//Its time complexity is 0(N)
//Wherever it is written it is in the range of array we usually use cyclic sort
import java.util.Arrays;
public class DSA_16 {
    public static void main(String[] args) {
        int[]arr  = {3,4,1,2,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cyclicSort(int[]arr){
        int i=0;
        while (i<arr.length){
            int correct = arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
    }
    static void swap(int []arr,int first,int last){
        int temp = arr[first];
        arr[first]  = arr[last];
        arr[last]  = temp;
    }
}
