import java.util.*;
public class Top150_106 {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backTracking(ans,"",n,0,0);
        return ans;
    }
    private void backTracking(List<String> ans,String s,int n,int left,int right){
        if(s.length()==n*2)
        {ans.add(s);
            return;}
        if(left<n)backTracking(ans,s+"(",n,left+1,right);
        if(right<left)backTracking(ans,s+")",n,left,right+1);
    }
}
