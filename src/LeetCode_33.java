//https://leetcode.com/problems/palindrome-linked-list/submissions/
//In this we first reverse the first half of the list and then check the first half and second half of the list
//We then re-reverse the list to make it normal
 class ListNode18 {
      int val;
      ListNode18 next;
      ListNode18() {}
      ListNode18(int val) { this.val = val; }
      ListNode18(int val, ListNode18 next) { this.val = val; this.next = next; }
  }
public class LeetCode_33 {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(ListNode18 head) {
        ListNode18 mid = middleElement(head);
        ListNode18 headSecond = reverseList(mid);
        ListNode18 reverseHead = headSecond;

        while (head!=null&&headSecond!=null){
            if(head.val!=headSecond.val){
                break;
            }
            head = head.next;
            headSecond = headSecond.next;
        }
        reverseList(reverseHead);
        return head==null||headSecond==null;

    }
    public ListNode18 middleElement(ListNode18 head){
        ListNode18 f = head;
        ListNode18 s = head;
        while(f!=null&&f.next!=null){
            f = f.next.next;
            s = s.next;

        }
        return s;
    }
    public ListNode18 reverseList(ListNode18 head){
        if(head==null){
            return head;
        }
        ListNode18 prev = null;
        ListNode18 present = head;
        ListNode18 next = present.next;
        while(present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null)
                next = next.next;
        }
        return prev;
    }
}
