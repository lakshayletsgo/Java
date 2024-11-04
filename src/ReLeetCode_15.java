import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReLeetCode_15 {
    class MinStack {
        int min = Integer.MIN_VALUE;
        Stack<Integer> minStack = new Stack<>();

        public void push(int val) {
            if(val<=min){
                minStack.push(min);
                min = val;
            }
            minStack.push(val);
        }

        public void pop() {
            if (minStack.pop()==min)min = minStack.pop();
        }

        public int top() {
            return minStack.peek();
        }

        public int getMin() {
            return min;
        }
    }
    public static void main(String[] args) {

    }
}
