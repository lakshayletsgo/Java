import java.util.*;

public class LeetCode_107 {
    public static void main(String[] args) {
        int[]arr = {73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        int []ans = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<temperatures.length;i++){
            while (!stack.isEmpty()&&temperatures[stack.peek()]<temperatures[i]){
                ans[stack.peek()] = i-stack.pop();
            }
//            stack.push(i);
        }
        return ans;
    }

}
