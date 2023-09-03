//https://leetcode.com/problems/merge-sorted-array/
import java.util.Arrays;
public class LeetCode_8 {
    public static void main(String[] args) {

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=0;i<nums1.length;i++){
            if (j < n) {
                nums1[m+i] = nums2[j];
                j++;
            }
        }
        Arrays.sort(nums1);


    }
}