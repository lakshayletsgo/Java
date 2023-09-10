//https://leetcode.com/problems/valid-parentheses/description/
//In this we have used the stack
//We have converted the string to a character array
//We have then checked whether it has the any of the opening braces
//If it contains any opening braces we have then pushed the closing same braces
//In the next iteration we have checked whether the poped element is the closing element is equal to the iterated element
//If not then we have returned false
//I was almost using the same approach just that i have used the variable instead of the stack
//And also in the end we have checked if the stack is empty or not
//If it is empty then it means we have push and poped the same element
//And hence return true else false

import java.util.Stack;
public class LeetCode_20 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));


    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char x : s.toCharArray()) {

            if(x=='('){

                stack.push(')');
            } else if (x=='{') {
                stack.push('}');

            } else if (x=='[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop()!=x) {

                return false;
            }

        }


        return stack.isEmpty();

    }
}
