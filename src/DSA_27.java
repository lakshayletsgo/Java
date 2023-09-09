//Quick Sort
//In this we randomly pick a element and call it as pivot
//We then place the element in such a way that the element smaller than the value is on the left and the element on right is greater than the pivot
//We just then call the recursion call in the element in the left half and then the right half
//It has time complexity of O(N*N) for worst case
//And for best case it is O(N*logN)
import java.util.Arrays;

public class DSA_27 {
    public static void main(String[] args) {
        int []arr = {5,8,3,1,4};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int []arr, int low,int hi){
        if(low>=hi){
            return;
        }
        int s = low;
        int e= hi;
        int m = s + (e-s)/2;
        int pivot = arr[m];
        while (s<=e){
//            It means the element is at its correct position and we don't have to change the side of the element
            if(arr[s]<pivot){
                s++;
            }

            if(arr[e]>pivot){
                e--;
            }

//            It means both the above cases are violeted and we have to swap
            if(s<=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] =temp;
                e--;
                s++;
            }
        }
//        We got the pivot at its right position and we can call the recursion call from it
        quickSort(arr,low,e);
        quickSort(arr,s,hi);



    }
}
