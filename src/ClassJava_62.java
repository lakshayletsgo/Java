import java.util.Stack;

class Stack6{
    int maxSize;
    int top;
    char [] StackArray;
    public Stack6(int v){
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
public class ClassJava_62 {
    public static void main(String[] args) {
        String infixExpression = "(a+b)*c";
        System.out.println(infixToPostfix(infixExpression));  // Output: "ab+c*"
    }

    public static String infixToPostfix(String infixExpression) {
        String postfixExpression = "";
        Stack6 stack = new Stack6(infixExpression.length());

        for (char ch : infixExpression.toCharArray()) {
            if (Character.isLetter(ch)) {
                postfixExpression += ch;
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfixExpression += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfixExpression += stack.pop();
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            postfixExpression += stack.pop();
        }

        return postfixExpression;
    }

    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
}

