import java.util.*;
public class Top150_48 {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int i=0;
        int j=0;
        while(j<nums.length){
            if(j<nums.length-1&&nums[j]+1==nums[j+1]){
                j++;
            }else{
                if(i==j){
                    ans.add(Integer.toString(nums[i]));
                }else{

                    String temp = nums[i]+"->"+nums[j];

                    ans.add(temp);
                }
                j++;

                i=j;
            }
        }
        return ans;
    }
}
