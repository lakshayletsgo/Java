//https://leetcode.com/problems/sum-of-values-at-indices-with-k-set-bits/submissions/1099520062/
//In this we just calculate the binary of the INDEX of a number and then check the number of 1 present in it
import java.util.List;
public class LeetCode_80 {
    public static void main(String[] args) {
//        binaryRepresentation(10);
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        // declare ans to store result
        int ans = 0;
        // iterate over nums array
        for(int i = 0; i < nums.size(); i++) {
            // get current number
            int curr = nums.get(i);
            // check if current index has k bbytes, if true add current number to answer
            if(bytesInNumber(i) == k) ans += curr;
        }
        // return answer
        return ans;
    }
    // declare function to count bytes
    public int bytesInNumber(int num) {
        // declare count to hold number of bytes
        int count = 0;
        // convert num to string bynary
        String binary = Integer.toBinaryString(num);
        // iterate over binary string
        for(int i = 0; i < binary.length(); i++) {
            // check ifcurrent byte equals to 1, if true increment counter
            if(binary.charAt(i) == '1') count++;
        }
        // return counter
        return count;
    }
}

