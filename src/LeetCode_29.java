//https://leetcode.com/problems/linked-list-cycle/
// In this we use the slow and fast pointer method
// In this we use two pointer, in which one iterate one at a time and other iterate two at a time
//If at any point both the pointer are same, the cycle is present else not

class ListNode12 {
      int val;
      ListNode12 next;
      ListNode12(int x) {
         val = x;
          next = null;
      }
  }
public class LeetCode_29 {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode12 head) {
        ListNode12 fast = head;
        ListNode12 slow = head;
        while(fast!=null||fast.next!=null){
            fast = fast.next.next;
            slow= slow.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }
}
