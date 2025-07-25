import java.util.*;
public class Top150_60 {
    public Node copyRandomList(Node head) {
        if(head==null)return null;
        Map<Node, Node> map = new HashMap<>();
        Node curr1 = head, curr2 = head;
        while(curr1!=null){
            map.put(curr1,new Node(curr1.val));
            curr1=curr1.next;
        }
        while(head!=null){
            Node newNode = map.get(head);
            newNode.next= map.get(head.next);
            newNode.random = map.get(head.random);
            head = head.next;
        }
        return map.get(curr2);
    }
}
