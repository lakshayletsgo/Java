import java.util.*;
public class Top150_55 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int ope1,ope2;
        for(String ch:tokens){
            if(ch.equals("+")){
                ope2 = stack.pop();
                ope1 = stack.pop();
                stack.push(ope2+ope1);
            }else if(ch.equals("-")){
                ope2 = stack.pop();
                ope1 = stack.pop();
                stack.push(ope1-ope2);
            }else if(ch.equals("/")){
                ope2 = stack.pop();
                ope1 = stack.pop();
                stack.push(ope1/ope2);
            }else if(ch.equals("*")){
                ope2 = stack.pop();
                ope1 = stack.pop();
                stack.push(ope2*ope1);
            }else{
                stack.push(Integer.parseInt(ch));
            }
        }
        return stack.peek();
    }
}
