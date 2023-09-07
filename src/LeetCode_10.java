//https://leetcode.com/problems/reverse-linked-list/description/
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
public class LeetCode_10 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(7);
    }

    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ListNode current = head;
        ListNode previous = null;
        while(current!=null){
            ListNode temp = current.next;
            current.next = previous;
            previous= current;
            current = temp;
        }
        return previous;

    }
}