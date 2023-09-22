import java.util.Stack;
class Stack2{
    int maxSize;
    int top;
    int [] StackArray;
    Stack2(int v){
        maxSize = v;
        StackArray= new int[v];
        top = -1;
    }
    public void push(int val){
        if(maxSize-1>top){
            StackArray[++top] = val;
        }else{
            System.out.println("Max Height Reached");
        }
    }
    public int pop(){
        if(top>=0){
            return StackArray[top--];
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

public class ClassJava_59 {
    public static void main(String[] args) {
        Stack2 l1 = new Stack2(5);
        l1.push(10);
        l1.push(11);
        l1.push(12);
        l1.push(13);
        l1.push(14);
        System.out.println(l1.isEmpty());
        System.out.println(l1.isFull());
        System.out.println(l1.pop());
    }
}
