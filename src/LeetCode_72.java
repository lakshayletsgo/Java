//https://leetcode.com/problems/number-of-good-pairs/
//In this we have used Hash Map
//It is used in such a way that whenever it reaches same value it increases the value stored at that index and return it
//And in the end it divides the ans by two and returns it
//For that it uses the get method of the map and returns the value stores at that index and then get the index before it
import java.util.HashMap;
import java.util.Map;

public class LeetCode_72 {
    public static void main(String[] args) {
        int[]arr = {1,1,1,1};
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();

        for (int i : nums) {
            mpp.put(i, mpp.getOrDefault(i, 0) + 1);
        }

        int count = 0;
        for (int n : mpp.values()) {
            count += (n - 1) * n / 2;
        }

        return count;
    }
}
