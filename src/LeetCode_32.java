//https://leetcode.com/problems/middle-of-the-linked-list/submissions/
//It is obvious that when the fast pointer will move two, slow will move one
//So when the fast is at the end slow will be in middle
class ListNode16 {
      int val;
      ListNode16 next;
      ListNode16() {}
      ListNode16(int val) { this.val = val; }
      ListNode16(int val, ListNode16 next) { this.val = val; this.next = next; }
  }
public class LeetCode_32 {
    public static void main(String[] args) {

    }
    public ListNode16 middleNode(ListNode16 head) {
        ListNode16 fast = head;
        ListNode16 slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
