import java.util.LinkedList;
import java.util.Stack;

class Stack4{
    int maxSize;
    int top;
    LinkedList<Integer> stackLink;
    Stack4(int v){
        maxSize = v;
        stackLink = new LinkedList<>();
        top=-1;
    }
    public void push(int v){
        if(top<maxSize-1){
            stackLink.add(++top,v) ;
        }else{
            System.out.println("Stack is full");
        }
    }
    public int pop(){
        if(top>0){
            return stackLink.get(top--);
        }else{
            System.out.println("Stack is Empty");
            return -1;
        }
    }
    public boolean isFull(){
        return (maxSize-1<=top);
    }
    public boolean isEmpty(){
        return (top==-1) ;
    }
}
public class ClassJava_60 {
    public static void main(String[] args) {
        Stack4 s1 = new Stack4(5);
        s1.push(12);
        s1.push(14);
        s1.push(15);
        s1.push(16);
        s1.push(19);
        System.out.println(s1.pop());
        System.out.println(s1.isEmpty());
        System.out.println(s1.isFull());
    }
}
