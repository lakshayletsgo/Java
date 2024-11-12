import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ReLeetCode_29 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(""));
    }
    public  static int lengthOfLongestSubstring(String s) {
        int left=0;
        Set<Character> set = new HashSet<>();
        int maxLen = 0;
        for (int right = 0;right<s.length();right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen,right-left+1);
            }else{
                while (set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;

                }
                set.add(s.charAt(right));
            }
        }
        return maxLen;
    }
}
