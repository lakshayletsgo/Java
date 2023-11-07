//https://leetcode.com/problems/remove-linked-list-elements/submissions/1093881102/
//In this we use the recursion in which we go to the end first then we return from there and we return the head if its not the val and return next of head if it is val

public class LeetCode_65 {
    private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static void main(String[] args) {

    }
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }
        head.next  = removeElements(head.next,val);
        return head.val==val?head.next:head;
    }
}
