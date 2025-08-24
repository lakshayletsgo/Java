public class Top150_128 {

    public int singleNumber(int[] nums) {
        int temp = nums[0];
        for(int i=1;i<nums.length;i++) temp = temp ^ nums[i];
        return temp;
    }
}
