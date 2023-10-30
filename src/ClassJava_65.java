import org.w3c.dom.Node;
class Node20{
    Node20 next;
    int value;

    public Node20 (int value) {
        this.value = value;
    }

    public Node20 (int value, Node20 newN) {
        this.value = value;
        this.next = newN;
    }
}

//Using Array
class Queue2 {
    int size;
    Node20 front = null;
    Node20 rear = null;

    public Queue2(int value){
        Node20  newNode  =new Node20(value);
        front = newNode;
        rear = newNode;
    }
    public boolean isEmpty(){
        return rear.next==front||rear==null;
    }
    public void enqueue(int n){
        Node20 newNode = new Node20(n);
        if(front==null&&rear==null){
            front=newNode;
            rear= newNode;
        }else{

            rear.next  = newNode;
            rear = rear.next;
        }

    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("Queue is Empty!!!UnderFlow");
            return -1;
        }
        int v = front.value;
        front = front.next;
        return v;
    }
    public int peek(){
        return front.value;
    }


}
public class ClassJava_65 {
    public static void main(String[] args) {

    }
}
