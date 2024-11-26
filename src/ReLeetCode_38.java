import java.util.HashMap;

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class ReLeetCode_38 {
    public static void main(String[] args) {

    }
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> map = new HashMap<>();
        if (head==null){
            return null;
        }
        Node Curre = head;
        while (Curre!=null){
            map.put(Curre,new Node(Curre.val));
            Curre = Curre.next;
        }
        Curre = head;

        while (Curre!=null){
            Node copiedNode = map.get(Curre);
             copiedNode.next = map.get(Curre.next);
             copiedNode.random = map.get(Curre.random);
             Curre = Curre.next;
        }
        return map.get(head);
    }
}
