import java.util.List;

class ListCir{
    int val;
    ListCir next;
    ListCir(int v, ListCir n){
        this.val = v;
        this.next = n;
    }
}
public class ClassJava_58 {
    public static void main(String[] args) {

    }
    static DoubleList deleteBeg(DoubleList head){
        DoubleList temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next= head.next;
        return head.next;
    }
    static DoubleList deleteEnd(DoubleList head){
        DoubleList temp = head;
        while(temp.next.next!=head){
            temp= temp.next;
        }
        temp.next = head;
        return head;
    }
    static DoubleList deleteSpec(int pos, DoubleList head){
        DoubleList temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return temp;
    }
    static DoubleList inserSpec(DoubleList head, DoubleList newNode, int pos){
        DoubleList temp  =head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }

    static DoubleList inserBeg(DoubleList head, DoubleList newNode){
        DoubleList temp =head;
        while (temp.next!=head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        return newNode;
    }
    static DoubleList insertEnd(DoubleList head, DoubleList newNode){
        DoubleList temp = head;
        while(temp.next!=head){
            temp = temp.next;
        }
        temp.next =newNode;
        newNode.next =head;
        return head;
    }

}
