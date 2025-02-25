import java.util.ArrayList;
import java.util.List;

public class ReLeetCode_110 {
    public static void main(String[] args) {

    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        helper(ans,s,new ArrayList<String>(),0);
        return ans;
    }

    private void helper(List<List<String>> ans, String s, List<String> integers, int i) {
        if (i==s.length()){
            ans.add(new ArrayList<>(integers));
            return;
        }
        for (int j = i+1; j < s.length(); j++) {
            if (isPali(s,i,j-1)){
                integers.add(s.substring(i,j));
                helper(ans,s,integers,j);
                integers.remove(integers.size()-1);
            }
        }
    }

    private boolean isPali(String s, int i, int i1) {
        while (i<i1) if (s.charAt(i++)!=s.charAt(i1++))return false;
        return true;
    }
}
