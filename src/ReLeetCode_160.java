public class ReLeetCode_160 {
    public static void main(String[] args) {

    }
    public int singleNumber(int[] nums) {
        if (nums.length==1)return nums[0];
        int temp=0;
        for (int i=0;i<nums.length;i++)temp = temp^nums[i];
        return temp;
    }
}
