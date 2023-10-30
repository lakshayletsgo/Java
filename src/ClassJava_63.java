import java.util.Stack;
class Stack7{
    int maxSize;
    int top;
    char [] StackArray;
    public Stack7(int v){
        StackArray = new char[v];
        maxSize = v;
        top=-1;
    }
    public void push(char ch){
        if(!isFull()){
            top++;
            StackArray[top] = ch;

        }else{
            System.out.println("Max Height Reached");
        }
    }
    public char pop(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return 0;
        }else{
            return StackArray[top--];
        }
    }
    public boolean isFull(){
        return top==maxSize-1;
    }
    public boolean isEmpty(){
        return top<=-1;
    }
    public char peek(){
        return StackArray[top];
    }
}
public class ClassJava_63 {
    public static void main(String[] args) {
        String expression = "(a+b)*c";
        System.out.println(isBalanced(expression));  // Output: true
    }

    public static boolean isBalanced(String expression) {
        Stack7 stack = new Stack7(expression.length());

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((top == '(' && ch != ')') || (top == '{' && ch != '}') || (top == '[' && ch != ']')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
