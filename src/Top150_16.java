public class Top150_16 {
    public int trap(int[] height) {
        int start=  0;
        int end =height.length-1;
        int totalWater= 0;
        int leftMax= height[start];
        int rightMax=height[end];
        while(start<end){
            if(leftMax<rightMax){
                start++;
                leftMax = Math.max(leftMax,height[start]);
                totalWater+=leftMax-height[start];
            }else{
                end--;
                rightMax= Math.max(rightMax,height[end]);
                totalWater+=rightMax-height[end];
            }
        }
        return totalWater;
    }
}
