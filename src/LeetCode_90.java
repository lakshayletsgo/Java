//https://leetcode.com/problems/shuffle-string/description/
//This was easy. We just have to append in the array at the index of the indcies
public class LeetCode_90 {
    public static void main(String[] args) {
        String s = "codeleet";
        int[]arr = {4,5,6,7,0,2,1,3};
        System.out.println(restoreString(s,arr));
    }
    public static String restoreString(String s, int[] indices) {
        char[]ans = new char[indices.length];
        for(int i=0;i<ans.length;i++){
            ans[indices[i]] = s.charAt(i);
        }
        String Ans = new String(ans);
        return Ans;
    }
    
}
