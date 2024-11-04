import java.util.Objects;
import java.util.Stack;

public class ReLeetCode_16 {
    public static void main(String[] args) {
        System.out.println(evalRPN(new String[]{"2","1","+","3","*"}));
    }
    public static int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();
        int ans=0;
        stack.push(Integer.parseInt(tokens[0]));
        for (int i=1;i<tokens.length;i++){
            if(!stack.isEmpty()){
                if(Objects.equals(tokens[i], "+") ||Objects.equals(tokens[i], "-") ||Objects.equals(tokens[i], "*") ||Objects.equals(tokens[i], "/") ){
                    int operand = stack.pop();
                    int operand2=stack.pop();
                    if(Objects.equals(tokens[i], "+") ){
                        ans = operand2+operand;
                    } else if (Objects.equals(tokens[i], "-") ) {
                        ans = operand2-operand;
                    } else if (Objects.equals(tokens[i], "/") ) {
                        ans = operand2/operand;
                    } else  {
                        ans=operand2*operand;
                    }
                    stack.push(ans);
                }else{
                    stack.push(Integer.parseInt(tokens[i]));
                }
            }else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}
