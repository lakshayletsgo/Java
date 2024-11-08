public class ReLeetCode_21 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{-1,0,3,5,9,12},9));
    }
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start<end){
            int mid = (end+start)/2;
            if(nums[mid]==target){
                return mid;
            } else if (nums[mid]<target) {
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return -1;
    }
}
