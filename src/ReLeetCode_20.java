import java.util.Map;
import java.util.Stack;

public class ReLeetCode_20 {
    public static void main(String[] args) {
        System.out.println(largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Map.Entry<Integer,Integer> > stack  = new Stack<>();
        int n = heights.length;
        for (int i=0;i<=n;i++){
            int start = i;
            while (!stack.isEmpty()&&(i==n||stack.peek().getValue()>heights[i])){
                Map.Entry<Integer,Integer> temp = stack.pop();
                int index= temp.getKey();
                int height = temp.getValue();
                int length = i-index;
                maxArea = Math.max(maxArea,height*length);
                start = index;
            }
            if(i<n) stack.push(Map.entry(start,heights[i]));

        }
        return maxArea;
    }
}
