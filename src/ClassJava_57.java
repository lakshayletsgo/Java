class DoubleList{
    int val;
    DoubleList prev;
    DoubleList next;
    DoubleList(int v, DoubleList p, DoubleList n){
        this.val =v;
        this.prev = p;
        this.next = n;
    }
}
public class ClassJava_57 {
    public static void main(String[] args) {

    }
    static DoubleList insertBeg(DoubleList head, DoubleList newNode){
        newNode.next = head;
        head.prev = newNode;
        return newNode;
    }
    static DoubleList insertEnd(DoubleList head, DoubleList newNode){
        DoubleList temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return head;
    }
    static DoubleList insertSpec(DoubleList head, DoubleList newNode, int pos){
        DoubleList temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next.prev = newNode;
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        return head;
    }
    static DoubleList deleteBeg(DoubleList head){
        head.next.prev = null;
        return head.next;
    }
    static DoubleList deleteEnd(DoubleList head){
        DoubleList temp =head;
        while (temp.next.next!=null){
            temp = temp.next;
        }
        temp.next  =null;
        return head;
    }
    static DoubleList deleteSpec(DoubleList head, int pos){
        DoubleList temp =head;
        for(int i=1;i<pos;i++){
            temp= temp.next;

        }
        temp.next.next.prev = temp;
        temp.next = temp.next.next;
        return head;
    }
}
