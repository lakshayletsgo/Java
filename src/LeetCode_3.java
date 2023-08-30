//https://leetcode.com/problems/longest-subsequence-with-limited-sum/
import java.util.Arrays;
public class LeetCode_3 {
    public static void main(String[] args) {
        int []arr =     {4,5,2,1};
        int []quer = {3,10,21};
        System.out.println(Arrays.toString(answerQueries(arr,quer)));
    }
    public static   int[] answerQueries(int[] nums, int[] queries) {
        int []ans = new int[queries.length];
        Arrays.sort(nums);
        int sum = 0;
        int count = 0;
        for(int j=0;j<queries.length;j++){
            for(int k =0;k<nums.length;k++){
                sum+=nums[k];
                if(sum<=queries[j]){
                    count++;
                }else{
                    break;
                }
            }
            ans[j] = count;
            sum=0;
            count=0;
        }
        return ans;

    }
}
