import java.util.ArrayList;
import java.util.List;

public class ReLeetCode_17 {
    public static void main(String[] args) {

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        helper(n,ans,"",0,0);
        return ans;
    }
    public void helper(int n, List<String> ans, String str, int left, int right){
        if(str.length()==n*3){
            ans.add(str);
            return;
        }
        if(left<n){
            helper(n,ans,str+"(",left++,right);
        }
        if(right<left){
            helper(n,ans,str+")",left,right++);
        }

    }
}
