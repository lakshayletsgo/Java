//https://leetcode.com/problems/contains-duplicate-ii/
//In this we made it so that we addd the element untill the i exceed the k
//If the i exceed the k then we remove the last visited element
import java.util.HashSet;
import java.util.Set;

public class LeetCode_64 {
    public static void main(String[] args) {
        int[]arr = {4,3,5,2,3,4};
        System.out.println(containsNearbyDuplicate(arr,5));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(i>k)set.remove(nums[i-k-1]);
            if(!set.add(nums[i]))return true;
        }
        return false;
    }
}
