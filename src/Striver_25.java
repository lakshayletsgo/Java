public class Striver_25 {
    public int trap(int[] height) {
        int start = 0;
        int end = height.length-1;
        int total=0;
        int leftMax = height[start];
        int rightMax = height[end];
        while(start<end){
            if(leftMax<rightMax){
                start++;
                leftMax = Math.max(leftMax,height[start]);
                total +=leftMax-height[start];
            }else{
                end--;
                rightMax = Math.max(rightMax,height[end]);
                total+= rightMax-height[end];
            }
        }
        return total;
    }
}
