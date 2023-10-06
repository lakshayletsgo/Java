//Custom Stack
//It is static so we have to make it dynamic so that it doesnot get full
class customStack{
    protected int[] data;
    int ptr = -1;

    private static final int DEFAULT_SIZE = 10;
    public customStack(){
        this(DEFAULT_SIZE);
    }
    public customStack(int size){
        data = new int[size];
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        data[++ptr] = item;
        return true;
    }
    public boolean isFull(){
        return ptr ==data.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public int pop()throws  Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }
        return data[ptr--];
    }
    public int peek() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[ptr];
    }
}

public class DSA_45 {
    public static void main(String[] args) throws Exception {
        customStack s1 =new customStack(20);
        s1.push(20);
        s1.push(21);
        s1.push(22);
        s1.push(23);
        s1.push(24);
        s1.push(25);
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    }

}
