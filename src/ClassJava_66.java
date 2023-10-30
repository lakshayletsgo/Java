class customCircularQueue2 {
    private int[]data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front =0;
    int size =0;
    public customCircularQueue2(){
        this(DEFAULT_SIZE);
    }
    public customCircularQueue2(int size){
        data = new int[size];
    }
    public boolean isFull(){
        return size==data.length-1;
    }
    public boolean isEmpty(){
        return size==-1;
    }
    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++] = item;
        end = end% data.length;
        size++;
        return true;
    }
    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Stack is Empty");
        }
        int removed = data[front];
        front = front% data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is Empty");
        }
        return data[front];
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i=front;
        do{
            System.out.println(data[i]+" ");
            i++;
            i%=data.length;
        }while (i!=end);
        System.out.println("END");
    }
}
public class ClassJava_66 {
    public static void main(String[] args) {

    }}