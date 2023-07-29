import java.util.Arrays;

// Binary Search for Sorted 2-D Array
//Here time complexity is 0(log(n)+log(m))
public class DSA_12 {
    public static void main(String[] args) {
        int [][]arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        System.out.println(Arrays.toString(search(arr, 30)));
    }
    static int[] rowBinarySearch(int [][]arr, int row,int cStart, int cEnd,int target){
        while (cStart<=cEnd){
            int mid = cStart +(cEnd-cStart)/2;
            if(arr[row][mid]==target){
                return new int[]{row,mid};
            }
            if(arr[row][mid]<target){
                cStart = mid+1;
            }else {
                cEnd = mid-1;

            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int [][]arr, int target){
         int rows = arr.length;
         int cols=  arr[0].length;
         if(rows==1){
             return rowBinarySearch(arr,0,0,cols-1,target);
         }
         int rStart = 0;
         int rEnd = rows -1;
         int cMid = cols/2;

         while (rStart<(rEnd-1)){
             int mid = rStart + (rEnd-rStart)/2;
             if(arr[mid][cMid]==target){
                 return new int[]{mid,cMid};
             }
             if(arr[mid][cMid]>target){
                 rEnd = mid;
             }else{
                 rStart = mid;
             }
         }
         if(arr[rStart][cMid]==target){
             return new int[]{rStart,cMid};
         }
         if(arr[rStart+1][cMid]==target){
             return new int[]{rStart+1,cMid};
         }


         if(target<=arr[rStart][cMid-1]){
            return rowBinarySearch(arr,rStart,0,cMid-1,target);
         }
        if(target>=arr[rStart][cMid+1]&&target<=arr[rStart][cols-1]){
            return rowBinarySearch(arr,rStart,cMid+1,cols-1,target);

        }
        if(target<=arr[rStart+1][cMid-1]){
            return rowBinarySearch(arr,rStart+1,0,cMid-1,target);

        }else {
            return rowBinarySearch(arr,rStart+1,cMid+1,cols-1,target);

        }
    }
}
