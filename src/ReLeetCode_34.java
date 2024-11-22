
public class ReLeetCode_34 {
    private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {

        if (head==null||head.next==null){
            return head;
        }
        ListNode next = null;
        ListNode prev = null;
        while (head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;


    }

    public static void main(String[] args) {

    }
}
