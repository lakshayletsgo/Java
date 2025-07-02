public class Top150_2 {
    public int removeElement(int[] nums, int val) {

        int temp =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                nums[i]=-1;
                temp++;
            }
        }
        int start = 0, end=nums.length-1;
        while(start<=end){
            if(nums[start]!=-1&&nums[end]==-1){
                start++;
                end--;
            }else if(nums[start]==-1&&nums[end]!=-1){
                nums[start]=nums[end];
                nums[end]=-1;
                start++;
                end--;

            }else if(nums[start]==-1&&nums[end]==-1)end--;
            else if(nums[start]!=-1&&nums[end]!=-1){
                start++;
            }

        }
        return nums.length-temp;
    }
}
