import java.util.*;
public class Striver_26 {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            recursive(nums, 0, result);
            return result;
        }

        private static void recursive(int[] nums, int i, List<List<Integer>> result) {
            if (i == nums.length) {
                List<Integer> list = new ArrayList<>();
                for (int j = 0; j < nums.length; j++) {
                    list.add(nums[j]);
                }
                result.add(new ArrayList<>(list));
                return;
            }
            for (int j = i; j < nums.length; j++) {
                swap(nums, j, i);
                recursive(nums, i + 1, result);
                swap(nums, j, i);
            }
        }

        private static void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

}
