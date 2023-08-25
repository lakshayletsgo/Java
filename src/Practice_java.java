public class Practice_java {
    public static void main(String[] args) {
        int []arr = {4,5,6,8,9};
        System.out.println(search(arr,7));
    }
     static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start +(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                start = mid;
            }else {
                end = mid - 1;
            }
        }
        return end+1;
    }

}