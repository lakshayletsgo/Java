//https://leetcode.com/problems/decode-xored-array/
//I have almost decoded it
//In this we just exor the number and store it in the new arr

import java.util.Arrays;
public class LeetCode_85 {
    public static void main(String[] args) {
        int[]arr = {4,2,0,7};
        System.out.println(Arrays.toString(decode(arr,3)));
    }
    public static int[] decode(int[] encoded, int first) {
        int[]ans = new int[encoded.length+1];

        ans[0] = first;
        for(int i=0;i<encoded.length;i++){
            ans[i+1] = encoded[i]^ans[i];

        }
        return ans;
    }
}
