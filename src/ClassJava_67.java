//Using Array
class DoubleEndedQueue {
    int size;
    int[]arr;
    private int front =-1;
    private int rear = -1;
    public DoubleEndedQueue(int size){
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
    public void insertRear(int n){
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
    public void insertFront(int n){
        if(isFull()){
            System.out.println("Queue is full!!OverFlow");
            return;
        }
        if(front==-1&&rear==-1){
            front=0;
            rear = 0;
        }else{

            arr[++front]= n;
        }

    }
    public int deleteFront(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!!UnderFlow");
            return -1;
        }
        return arr[front++];
    }
    public int deleteRear(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!!UnderFlow");
            return -1;
        }
        return arr[rear--];
    }
    public int peek(){
        return arr[front];
    }


}
public class ClassJava_67 {
    public static void main(String[] args) {

    }
}
