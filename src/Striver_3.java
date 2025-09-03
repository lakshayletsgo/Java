import java.util.*;
public class Striver_3 {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int left = 0;
            int maxLeng= 0;
            for(int right=0;right<s.length();right++){
                if(!set.contains(s.charAt(right))){
                    set.add(s.charAt(right));
                    maxLeng = Math.max(maxLeng,right-left+1);
                }else{
                    while(set.contains(s.charAt(right))){
                        set.remove(s.charAt(left));
                        left++;}

                    set.add(s.charAt(right));
                }
            }
            return maxLeng;
        }
    }

