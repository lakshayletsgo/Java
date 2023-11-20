//Using Array
class Queue1{
    int size;
    int[]arr;
    private int front =-1;
    private int rear = -1;
    public Queue1(int size){
        this.size = size;
        arr = new int[size];
    }
    public boolean isFull(){
        if(front>rear){
            return true;
        } else if (rear==size-1)   {
            return  true;
        }else{
            return false;
        }

    }
    public boolean isEmpty(){
        return rear==-1||front==-1;
    }
    public void enqueue(int n){
        if(isFull()){
            System.out.println("Queue is full!!OverFlow");
            return;
        }
        if(front==-1&&rear==-1){
            front=0;
            rear = 0;
        }else{

            arr[++rear]= n;
        }

    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!!UnderFlow");
            return -1;
        }
        return arr[front++];
    }
    public int peek(){
        return arr[front];
    }


}
public class ClassJava_64 {
    public static void main(String[] args) {
        Queue1 q1 = new Queue1(5);
        q1.enqueue(20);
        q1.enqueue(21);
        q1.enqueue(22);
        q1.enqueue(23);
        q1.enqueue(24);
        System.out.println(q1.dequeue());
        System.out.println(q1.dequeue());
        System.out.println(q1.isEmpty());
        System.out.println(q1.isFull());

    }
}
