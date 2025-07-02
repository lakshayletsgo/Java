public class Top150_3 {
    public int removeDuplicates(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                nums[i]=-101;
                ans++;
            }
        }

        int start =0;
        int end =0;
        while(end<nums.length){
            if(nums[end]==-101)end++;
            else if(nums[end]!=-101&&nums[start]==-101){
                int temp = nums[end];
                nums[end]=nums[start];
                nums[start]=temp;
                start++;
            }else{
                start++;
                end++;
            }
        }


        return nums.length-ans;

    }
}
