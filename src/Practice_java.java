//Binary Search
//Binary search is good beacause its time complexity for worst case is O(logN)
//In this we first take the ascending or descending order of the array (Sorted Array)
//We then divide the array in two parts and check whether the target is less than or greater than the middle elements
//And so on we divide the arrray and find the target
public class Practice_java {
    public static void main(String[] args) {
        int []arr = {-1,2,34,13,34,55};
        int target = 4;
        System.out.println(binarySearch(arr,target));
    }
//    Return the element greater or equal to the number
    static int binarySearch(int[]arr, int target){
        int start = 0;
        int end=arr.length-1;
        while(start<=end){

//            Find middle element, We have done (end-start) because (start+end) can sometime exceed the size of int
            int mid = start+ (end-start)/2;

//            Checking whether it is ascending order or descending order
            boolean isAsc = arr[start]<arr[end];


            if(target<arr[mid]){
                end= mid-1;
            }else if(target>arr[mid]) {
                start=mid+1;
            }else {
                return mid;

                }



        }
        return arr[start];
    }

}