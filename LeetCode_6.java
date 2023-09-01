//search-in-rotated-sorted-array
package FOCP_PROJECT;

public class LeetCode_6 {
    public static void main(String[] args) {
        int[]arr = {3,1};
        System.out.println(search(arr,3));
    }
    public static int binSearchRotated(int[] nums, int l, int r, int target) {


        while(l <= r) {
            int mid = l + (r-l)/2;
            if (nums[mid] == target)
                return mid;

            if (l == r) {
                return -1;
            }


            if (l == mid || nums[l] < nums[mid]) {


                if (nums[l] <= target && target < nums[mid])
                    r = mid - 1;
                else
                    l = mid + 1;

            } else if (mid == r || nums[mid] < nums[r]) {

                if (nums[mid] < target && target <= nums[r])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
        }
        return -1;
    }

    public static int search(int[] nums, int target) {
        return binSearchRotated(nums, 0, nums.length - 1, target);
    }
}
