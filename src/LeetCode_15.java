//https://leetcode.com/problems/counting-bits
import java.util.Arrays;

public class LeetCode_15 {
    public static void main(String[] args) {
        int n=5;
        System.out.println(Arrays.toString(countBits(n)));
    }
        public static int[] countBits(int n) {
        int []ans = new int[n+1];
        int x= 0;
        int r=0;

        for(int i=0;i<=n;i++){
            int sum=0;
            String j=Integer.toBinaryString(i);
            for(int l=0;l<j.length();l++){
                if(j.charAt(l)=='1'){
                    sum++;
                }
            }
            ans[x] = sum;
            x++;
        }
        return ans;
    }
}
