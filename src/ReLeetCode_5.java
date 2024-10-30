import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ReLeetCode_5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[]{1,1,2,4},1)));
    }
    public static int[] topKFrequent(int[] nums, int k) {
//        Arrays.sort(nums);
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length+1];
        int min = nums[0];
        int max = nums[nums.length-1];
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int temp:map.keySet()){
            int freq = map.get(temp);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(temp);
        }

        int []ans = new int[k];
        int pos = 0;
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(int j=0;j<bucket[i].size()&&pos<k;j++){
                    ans[pos] = bucket[i].get(j);
                    pos++;
                }
            }
        }
        return  ans;

    }
}
