//Searching in a mountain array
//For this we have just used previous concepts that are we have divided the array in two parts
//First is ascending till the peak of the mountain
//Second is descending from the peak to the end
//We have used orderAgnostics Binary Search (It is normal binary search just it has a part where it check it is ascending or descending)

public class DSA_8 {
    public static void main(String[] args) {
        int []arr= {1,4,6,9,4,2,1};
        int target = 1;
        System.out.println(search(arr,target));
    }
    static int search(int []arr, int target){
        int peak = peakIndexInMountain(arr);
        int firstTry =  binarySearch(arr,target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        else {
            return (binarySearch(arr,target,peak+1,arr.length-1));
        }
    }
    static int peakIndexInMountain(int[]arr){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end =mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    static int binarySearch(int[]arr, int target,int start,int end){
        while(start<=end){

//            Find middle element, We have done (end-start) because (start+end) can sometime exceed the size of int
            int mid = start+ (end-start)/2;

//            Checking whether it is ascending order or descending order
            boolean isAsc = arr[start]<arr[end];
            if(target==arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target<arr[mid]){
                    end= mid-1;
                } else {
                    start=mid+1;
                }
            }else {
                if(target>arr[mid]){
                    end= mid-1;
                } else  {
                    start=mid+1;
                }
            }

        }
        return -1;
    }
}
