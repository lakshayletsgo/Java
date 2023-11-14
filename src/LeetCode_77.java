//https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/
//In this also i have maintained a max variable and add false if the current value is less than the max and add true if it is greater than it
import java.util.ArrayList;
import java.util.List;

public class LeetCode_77 {
    public static void main(String[] args) {
        int []arr = {12,1,12};
        System.out.println(kidsWithCandies(arr,10));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max =0;
        for(int i:candies){
            if(i>max){
                max=i;
            }
        }
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }

        }
        return ans;
    }
}
