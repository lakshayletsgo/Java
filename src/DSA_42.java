//Insertion using recursion
class Node9{
    int val;
    Node9 next;
    Node9(int val){
        this.val = val;
    }
    Node9(int val, Node9 next){
        this.val = val;
        this.next= next;
    }

}
public class DSA_42 {
    public static void main(String[] args) {

    }
    static void insertRec(int val,int index, Node9 head){
        head = insertRecc(val,index,head);
    }
    static Node9 insertRecc(int val,int index,Node9 node){
        if(index ==0){
            Node9 newNode = new Node9(val,node);
            return newNode;
        }
        node.next = insertRecc(val,index--,node.next);
        return node;
    }
}
