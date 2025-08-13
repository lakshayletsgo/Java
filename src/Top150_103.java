import java.util.*;
public class Top150_103 {

        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            if (nums.length==1){
                List<Integer>sub = new ArrayList<>();
                sub.add(nums[0]);
                ans.add(sub);
                return ans;
            }
            for (int i = 0; i <nums.length; i++) {
                int n = nums[i];
                int[]remainingNum = new int[nums.length-1];
                int index=0;
                for (int j = 0; j <nums.length ; j++) {
                    if (j!=i){
                        remainingNum[index] = nums[j];
                        index++;
                    }
                }
                List<List<Integer>> temp = permute(remainingNum);
                for (List<Integer> per:temp){
                    per.add(n);
                }
                ans.addAll(temp);
            }
            return ans;
        }

}
