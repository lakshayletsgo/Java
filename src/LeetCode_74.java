//https://leetcode.com/problems/shuffle-the-array/description/
//It can be optimised by creating only one array and then we can use the method in which we can traverse such that for every n*2 the value is n and for n*2+1 the value is n+i
import java.util.Arrays;
public class LeetCode_74 {
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr,4)));
    }
    public static int[] shuffle(int[] nums, int n) {
        if(nums.length<=1){
            return nums;
        }
        int[] nums2 = Arrays.copyOfRange(nums,n,nums.length);
        int[] nums1 = Arrays.copyOfRange(nums,0,n);
        int[]arr = new int[nums.length];
        int c=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                arr[i] =nums1[c2];
                c2++;
            }else{
                arr[i] = nums2[c];
                c++;
            }

        }
        return arr;
    }
}
