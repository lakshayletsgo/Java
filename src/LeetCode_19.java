//https://leetcode.com/problems/orderly-queue/description/
//In this we have first check if the value of k is greater than 1
//If it is greater than 1 then it the result string will always be in best lexilogical order
//So we just convert the string to array and sort the array and return it
//If the value of the k is equal to 1 we just iterate it till the length and make it such that it checks if the new string is smaller or not
import java.util.Arrays;
public class LeetCode_19 {
    public static void main(String[] args) {

    }
    public String orderlyQueue(String s, int k) {
        if(k>1){
            char tempArray[] = s.toCharArray();
            Arrays.sort(tempArray);
            return new String(tempArray);
        } else {
            String ans = s;
            for (int i = 0; i < s.length(); i++) {
                s = s.substring(1) + s.substring(0, 1);
                if (ans.compareTo(s) > 0) {
                    ans = s;
                }
            }
            return ans;
        }
    }

}
