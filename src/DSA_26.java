//Merge Sort
// In this we first divide the array in two part and then sub divide it
//We divide the array till it remains to 1 length
//We then merge the sorted array
//We use recursion in this

import java.util.Arrays;

public class DSA_26 {
    public static void main(String[] args) {
        int[]arr = {5,8,2,4,1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int[]arr){
        if(arr.length==1){
            return arr;
        }
        int mid  = arr.length/2;


//        This will make a copy of the array and store the array in left
        int []left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int []right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }


//    Merging the two array
    static int[] merge(int []first,int[]second){
        int []sort= new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;

        while(i<first.length&&j<second.length){
            if(first[i]<second[j]){
                sort[k] = first[i];
                i++;
            }else{
                sort[k] = second[j];
                j++;
            }
            k++;
        }
        while(i<first.length){
            sort[k] = first[i];
            k++;
            i++;
        }
        while(j<second.length){
            sort[k] = second[j];
            k++;
            j++;
        }
        return sort;
    }
}
