import java.util.Arrays;

public class ReLeetCode_6 {
    public static void main(String[] args) {
        int[] ans = productExceptSelf(new int[]{-1,1,0,-3,3});
        System.out.println(Arrays.toString(ans));
    }
    public static int[] productExceptSelf(int[] nums) {
        int []ans = new int[nums.length];
        int[]preFix = new int[nums.length];
        int[]sufFix = new int[nums.length];
        preFix[0] = 1;
        for (int i=1;i<nums.length;i++){

            preFix[i] = preFix[i-1]*nums[i-1];
        }
        sufFix[sufFix.length-1] = 1;
        for (int i=nums.length-2;i>=0;i--){
            sufFix[i] =  sufFix[i+1]*nums[i+1];
        }
        System.out.println(Arrays.toString(preFix));
        System.out.println(Arrays.toString(sufFix));
        for (int i=0;i<ans.length;i++){
            ans[i] = preFix[i]*sufFix[i];
        }
        return ans;
    }
}
