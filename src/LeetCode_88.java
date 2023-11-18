//https://leetcode.com/problems/create-target-array-in-the-given-order/
//It was easy I didn't knew that if we add element to an array list at a position where element is already there it gets shift
//So Here we have made a list and just added the items
import java.util.ArrayList;
import java.util.Arrays;
public class LeetCode_88 {
    public static void main(String[] args) {
        int []arr = {0,1,2,3,4};
        int []index= {0,1,2,2,1};

         System.out.println(Arrays.toString(createTargetArray(arr,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){

            arr.add(index[i],nums[i]);
        }
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}
