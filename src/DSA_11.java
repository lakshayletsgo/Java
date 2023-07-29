//Binary Search In 2-D Array
//For this time complexity is 0(N)
// For linear Search Time Complexity is 0(N*N)
// In this we first check for the last column and first row element then if it greater than the target we decrement the row
//Then we check in the previous coloumn if it is less than the element we increase the row

import java.lang.reflect.Array;
import java.util.Arrays;

public class DSA_11 {
    public static void main(String[] args) {
        int [][]arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(Arrays.toString(binarySearch2D(arr,7)));
    }
    static int[] binarySearch2D(int[][]arr, int target){
        int r = 0;
        int c = arr.length-1;
        while(r<arr.length-1&&c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            if(arr[r][c]>target){
                c--;
            }else {
                r++;
            }
        }
        return new int[]{-1,-1};

    }
}
