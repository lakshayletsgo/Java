public class ReLeetCode_13 {
    public static void main(String[] args) {
        System.out.println(trap(new int[]{4,2,0,3,2,5}));
    }
    public static int trap(int[] height) {
        int start = 0;
        int end = height.length-1;
        int leftMax= height[start];
        int rightMax = height[end];
        int water = 0;
        while (start<end){
            if(leftMax<rightMax){
                start++;
                leftMax=Math.max(leftMax,height[start]);
                water+=leftMax-height[start];
            }else {
                end--;
                rightMax=Math.max(rightMax,height[end]);
                water+=rightMax-height[end];
            }
        }
        return water;
    }
}
