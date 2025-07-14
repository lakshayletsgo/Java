import java.util.*;
public class Top150_31 {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set= new HashSet<>();
        int maxLen=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                maxLen=Math.max(maxLen,right-left+1);
            }else{
                while(set.contains(s.charAt(right))){
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            }
        }
        return maxLen;
    }
}
