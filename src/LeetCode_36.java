//https://leetcode.com/problems/implement-queue-using-stacks/submissions/
//Queue using Stack
//Here we have used stack to implement queue
//To be able to do this we have to make so that we insert from the top and delete from the bottom

import java.util.Stack;

class MyQueue {
    Stack<Integer> second;
    Stack<Integer> first;
    public MyQueue() {
        second = new Stack<>();
        first = new Stack<>();

    }

    public void push(int x) {
        first.push(x);

    }

    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed= second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public int peek() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int peek= second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peek;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
public class LeetCode_36 {
    public static void main(String[] args) {
        MyQueue m1 = new MyQueue();
        m1.push(1);
        m1.push(2);
        System.out.println(m1.peek());
        System.out.println(m1.pop());
        System.out.println(m1.empty());
    }
}
