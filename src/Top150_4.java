public class Top150_4 {
    public int removeDuplicates(int[] nums) {
        int ans = 0;
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+2]){
                nums[i]=Integer.MIN_VALUE;
                ans++;
            }
        }

        int start = 0;
        int end = 0;
        while(end<nums.length){
            if(nums[start]==Integer.MIN_VALUE&&nums[end]!=Integer.MIN_VALUE){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end]=temp;
                start++;
            }else if(nums[end]==Integer.MIN_VALUE)end++;
            else{
                start++;
                end++;
            }
        }
        return nums.length-ans;
    }
}
