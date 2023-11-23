//https://leetcode.com/problems/find-the-original-array-of-prefix-xor/submissions/1105040406/
//It was medium. It was not that hard. We just have to xor the two consecutive element to get the element

import java.util.Arrays;

public class LeetCode_95 {
    public static void main(String[] args) {
        int[]arr = {13};
        System.out.println(Arrays.toString(findArray(arr)));
    }
    public static int[] findArray(int[] pref) {

        int[]arr = new int[pref.length];
        arr[0] = pref[0];
        int j=1;
        for(int i=0;i<pref.length-1;i++){
            arr[j]= pref[i+1]^pref[i];
            j++;
        }
        return arr;
    }
}
