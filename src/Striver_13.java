import java.util.*;
public class Striver_13 {
    public boolean isValid(String s) {
        if(s.length()==1)return false;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='(')stack.push(')');
            else if(s.charAt(i)=='[')stack.push(']');
            else if(s.charAt(i)=='{')stack.push('}');
            else{
                if(stack.isEmpty()||stack.pop()!=s.charAt(i))return false;
            }
        }
        return stack.isEmpty();
    }
}
