public class ReLeetCode_12 {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int maxAr=0;
        int s=0;
        int e= height.length-1;
        while (s<e){
            maxAr=Math.max(Math.min(height[s],height[e])*(e-s),maxAr);
            if(height[s]<height[e]){
                s++;

            } else{
                e--;
            }

        }

        return maxAr;
    }
}
