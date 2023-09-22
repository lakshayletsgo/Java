import java.util.List;

class List3{
    int value;
    List3 next;
    List3(int v,List3 n){
        this.value = v;
        this.next = n;
    }
}
public class Class_Java_56 {

    public static void main(String[] args) {

    }
    static List3 deleteBeg(List3 head){
        List3 temp = head;
        temp= temp.next;
        return temp;
    }
    static List3 deleteEnd(List3 head){
        List3 temp = head;
        List3 temp2= head;
        int c = 0;
        while(temp!=null){
            temp = temp.next;
            c++;
        }
        for(int i=1;i<c-1;i++){
            temp2 = temp2.next;
        }
        temp2.next = null;
        return temp2;

    }
    static List3 deleteSpec(int pos, List3 head){
        List3 temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return temp;
    }

    static List3 insertBeg(List3 newNode, List3 head){
        newNode.next = head;
        return newNode;
    }
    static List3 insertEnd(List3 newNode, List3 head){
        List3 temp  =head;
        while (temp.next!=null){
            temp= temp.next;
        }
        temp.next = newNode;
        return head;
    }
    static List3 insertSpec(List3 newNode,List3 head,int pos){
        List3 temp  =head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        return head;
    }
}
