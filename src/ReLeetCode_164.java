public class ReLeetCode_164 {
    public static void main(String[] args) {

    }
    public int missingNumber(int[] nums) {
        int h=nums.length;
        for (int i=0;i<nums.length;i++){
           h^=i;
           h^=nums[i];
        }
        return h;
    }
}
