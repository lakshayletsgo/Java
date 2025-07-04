public class Top150_9 {

    public boolean canJump(int[] nums) {
        int temp = 0;
        for(int i=0;i<nums.length;i++){
            if(i>temp)return false;
            temp = Math.max(temp, i+nums[i]);
        }
        return true;
    }
}
