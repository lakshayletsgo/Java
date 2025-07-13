public class Top150_28 {
    public int maxArea(int[] height) {
        int s=0;
        int max=0;
        int e=height.length-1;
        while(s<e){
            max=Math.max(Math.min(height[s],height[e])*(e-s),max);
            if(height[s]>height[e])e--;
            else s++;
        }
        return max;
    }
}
