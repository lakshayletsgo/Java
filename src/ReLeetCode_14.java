import java.util.Stack;

public class ReLeetCode_14 {
    public static void main(String[] args) {
        System.out.println(isValid("(){{}"));
    }
    public static  boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char temp:s.toCharArray()){
            if((temp=='('||temp=='['||temp=='{')){
                stack.push(temp);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.peek();
                if((temp==')'&&top=='(')||(temp==']'&&top=='[')||(temp=='}'&&top=='{')){
                    stack.pop();
                }else {
                    return false;
                }
            }

        }
        return stack.isEmpty();

    }
}
