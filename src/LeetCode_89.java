//https://leetcode.com/problems/decompress-run-length-encoded-list/
//This was also simple
//In this we have to make a array based on the frequency of the element
//We first count the frequency and then make an array and then add the element in it
import java.util.Arrays;
public class LeetCode_89 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4};
        System.out.println(Arrays.toString(decompressRLElist(arr)));
    }

    public static int[] decompressRLElist(int[] nums) {
        int arrSize = 0;
        for (int i = 0; i < nums.length; i += 2) {
            arrSize += nums[i];
        }

        int[] result = new int[arrSize];

        int startIdx = 0;
        for (int i = 0; i < nums.length; i += 2) {
            Arrays.fill(result, startIdx, startIdx + nums[i], nums[i + 1]);
            startIdx += nums[i];
        }
        return result;
    }
}
