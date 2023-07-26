//Ceiling and Flooring Problem solved by binary sort
//Ceiling is finding element which is greater or equal to the target element
//Flooring is finding element which is lesser or equal to the target element
public class DSA_4 {
    public static void main(String[] args) {
        int []arr = {-1,2,34,13,34,55};
        int target = -60;
        System.out.println(Ceiling(arr,target));
        System.out.println(Flooring(arr,target));
    }

    static int Ceiling(int[]arr, int target){
        int start = 0;
        int end=arr.length-1;
        if(target>arr[end]){
            return -1;
        }
        while(start<=end){

//            Find middle element, We have done (end-start) because (start+end) can sometime exceed the size of int
            int mid = start+ (end-start)/2;

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
    static int Flooring(int[]arr, int target){
        int start = 0;
        int end=arr.length-1;
        if(target<arr[start]){
            return -1;
        }
        while(start<=end){

//            Find middle element, We have done (end-start) because (start+end) can sometime exceed the size of int
            int mid = start+ (end-start)/2;


            if(target<arr[mid]){
                end= mid-1;
            }else if(target>arr[mid]) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return arr[end];
    }

}