public class ReLeetCode_128 {
    public static void main(String[] args) {

    }
    public int jump(int[] nums) {
        int far =0,jump=0,near=0;
        while (far<nums.length-1){
            int farest = 0;
            for (int i=near;i<=far;i++){
                farest = Math.max(farest,i+nums[i]);
            }
            near = far+1;
            far = farest;
            jump++;
        }
        return jump;
    }
}
