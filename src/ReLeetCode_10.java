import java.util.Arrays;
import java.util.HashMap;

public class ReLeetCode_10 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2,3,4},6)));
    }
//    public static int[] twoSum(int[] numbers, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i=0;i<numbers.length;i++){
//            map.put(numbers[i],i);
//
//        }
//        int i=0;
//        int j= numbers.length-1;
//        while (i<j){
//            if (map.containsKey(target-numbers[i])){
//                return new int[]{i,map.get(target-numbers[i])};
//            }
//            i++;
//        }
//
//
//        return new int[]{-1,-1};
//    }

//    Constant Space
public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while (left<right){
            int total = numbers[left]+numbers[right];
            if(total==target){
                return new int[]{left+1,right+1};

            } else if (total<target) {
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
}
}
