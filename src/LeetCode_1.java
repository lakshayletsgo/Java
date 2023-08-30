//https://leetcode.com/problems/minimum-common-value/
public class LeetCode_1 {
    public static void main(String[] args) {
        int []arr1 = {2,4,6,7};
        int []arr2 = {3,7,8,9};
        System.out.println(getCommon(arr1,arr2));

    }
    public static int getCommon(int[] nums1, int[] nums2) {
        int x=0;
        int y=0;
        while(x<nums1.length&&y<nums2.length){
            if(nums1[x]==nums2[y]){
                return nums1[x];
            }
            if(nums1[x]>nums2[y]){
                y++;
            }else{
                x++;
            }
        }
        return -1;
    }
}
