//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

class ListNode10 {
     int val;
      ListNode10 next;
      ListNode10() {}
      ListNode10(int val) { this.val = val; }
      ListNode10(int val, ListNode10 next) { this.val = val; this.next = next; }
  }
public class LeetCode_28 {
    public static void main(String[] args) {

    }
    public ListNode10 deleteDuplicates(ListNode10 head) {
        ListNode10 node = head;
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next = node.next.next;
            }else{
                node = node.next;
            }
        }
        return head;
    }
}
