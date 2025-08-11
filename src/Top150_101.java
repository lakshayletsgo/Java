import java.util.*;
public class Top150_101 {
    class Solution {
        public List<String> letterCombinations(String digits) {
            List<String> ans = new ArrayList<>();
            if (digits==null||digits.length()==0) return ans;
            Map<Character,String> set = new HashMap();
            set.put('2',"abc");
            set.put('3',"def");
            set.put('4',"ghi");
            set.put('5',"jkl");
            set.put('6',"mno");
            set.put('7',"pqrs");
            set.put('8',"tuv");
            set.put('9',"wxyz");
            backtrack(digits,new StringBuilder(),set,ans,0);
            return ans;
        }

        private void backtrack(String digits, StringBuilder stringBuilder, Map<Character, String> set, List<String> ans, int i) {
            if (i==digits.length()){
                ans.add(stringBuilder.toString());
                return;
            }
            String letters = set.get(digits.charAt(i));
            for (char letter:letters.toCharArray()){
                stringBuilder.append(letter);
                backtrack(digits,stringBuilder,set,ans,i+1);
                stringBuilder.deleteCharAt(stringBuilder.length()-1);
            }


        }
    }
}
