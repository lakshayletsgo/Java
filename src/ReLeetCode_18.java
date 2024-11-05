import java.util.Arrays;
import java.util.Map;
import java.util.Stack;

public class ReLeetCode_18 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(dailyTemperatures(new int[]{89,62,70,58,47,47,46,76,100,70})));
    }
    public static int[] dailyTemperatures(int[] temperatures) {


//      TIME LIMIT EXCEEDED
//        if(temperatures.length<=1){
//            return new int[]{0};
//        }
//        int []ans = new int[temperatures.length];
//        ans[temperatures.length-1] = 0;
//        for (int i=0;i<temperatures.length-1;i++){
//            int temp=0;
//            for (int j=i+1;j<temperatures.length;j++){
//                temp++;
//                if (temperatures[i]<temperatures[j]){
//                    ans[i] = temp;
//                    break;
//                }else{
//                    ans[i] =0;
//                }
//            }
//        }
//        return ans;


        Stack<Map.Entry<Integer,Integer>> stack = new Stack<>();
        int []ans = new int[temperatures.length];
        Arrays.fill(ans,0);
        stack.push(Map.entry(temperatures[0],0));
        for (int i=1;i<temperatures.length;i++){
            System.out.println(stack.peek().getKey());
            while ((!stack.isEmpty())&&(stack.peek().getKey()<temperatures[i])){
                Map.Entry <Integer,Integer> temp= stack.pop();
                ans[temp.getValue()]= i-temp.getValue();
            }
            stack.push(Map.entry(temperatures[i],i));
        }
        return ans;
    }

}
