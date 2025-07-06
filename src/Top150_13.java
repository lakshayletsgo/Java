public class Top150_13 {
    public int[] productExceptSelf(int[] nums) {
        int[]res = new int[nums.length];
        int left=1,right =1;
        for(int i=0;i<nums.length;i++){
            res[i]=left;
            left = nums[i]*left;
        }
        for(int i=nums.length-1;i>=0;i--){
            res[i] = right*res[i];
            right = right*nums[i];
        }
        return res;
    }
}
