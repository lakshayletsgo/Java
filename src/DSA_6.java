//Binary Search for Infinite Length of Array
//For infinite length we just don't use the .length function

//We have used the reverse binary approach
//We start from 2 length of value and then double it everytime and apply binary search to it
public class DSA_6 {
    public static void main(String[] args) {
        int []arr = {2,4,6,12,35,23,53,56};
        int target = 12;
        System.out.println(position(arr,target));
    }
    static int position(int [] arr, int target){
        int start = 0;
        int end = 1;
//        Doubling the array length till the element is not greater than the end element of the array
        while(arr[end]<target){
            int newS = end+1;
            int newEnd = end+(end-start+1)*2;
            start = newS;
            end = newEnd;
        }
        return search(arr,target,start,end);
    }

//    Searching the element in the array
    static int search(int []arr, int target, int start, int end){
        while(start<=end){
            int mid= start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target > arr[mid]) {
                start=mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
