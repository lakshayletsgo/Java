import java.util.*;
public class Striver_40 {
    public int largestRectangleArea(int[] heights) {
        Stack<Map.Entry<Integer,Integer>> stack = new Stack<>();
        int n= heights.length;
        int maxArea=0;
        for(int i=0;i<=n;i++){
            int start= i;
            while((!stack.isEmpty())&&(i==n||stack.peek().getValue()>heights[i])){
                Map.Entry<Integer,Integer> temp=stack.pop();
                int length= i-temp.getKey();
                maxArea= Math.max(maxArea,temp.getValue()*length);
                start=temp.getKey();
            }
            if(i<n)stack.push(Map.entry(start,heights[i]));
        }
        return maxArea;
    }
}
