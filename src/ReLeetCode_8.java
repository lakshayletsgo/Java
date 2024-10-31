import java.util.HashMap;
import java.util.HashSet;

public class ReLeetCode_8 {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{0,-1}));
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length<=0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        int max=0;
        HashSet<Integer> hs = new HashSet<>();
        for (int n:nums){
            hs.add(n);
        }
        for (int n:nums){
            if (!hs.contains(n-1)){
                int l=1;
                int  c=n;
                while (hs.contains(c+1)){
                    c++;
                    l++;
                }
                max=Math.max(max,l);
            }
        }

        return max;
    }
}
