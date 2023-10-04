//https://leetcode.com/problems/reorder-list/
//In this we will first reverse the second half of the list and then take two head and then merge them one by one
//We have not created a new list
//we have just changed the next value of each node
class ListNode19 {
    int val;
    ListNode19 next;
    ListNode19() {}
    ListNode19(int val) { this.val = val; }
    ListNode19(int val, ListNode19 next) { this.val = val; this.next = next; }
}
public class LeetCode_34 {
    public static void main(String[] args) {

    }
    public ListNode19 middleNode(ListNode19 head){
        ListNode19 f = head;
        ListNode19 s = head;
        while (f!=null&&f.next!=null){
            f = f.next.next;
            s = s.next;

        }return s;
    }
    public ListNode19 reverseList(ListNode19 head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode19 prev = null;
        ListNode19 present = head;
        ListNode19 next = present.next;
        while (present!=null){
            present.next = prev;
            prev = present;
            present = next;
            if(next!=null){
                next = next.next;
            }
        }
        return prev;
    }
    public void reorderList(ListNode19 head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode19 mid = middleNode(head);
        ListNode19 hs = reverseList(mid);
        ListNode19 hf= head;
        while (hf!=null&&hs!=null){
            ListNode19 temp = hf.next;
            hf.next = hs;
            hf = temp;

            temp  = hs.next;
            hs.next = hf;
            hs = temp;
        }
        if(hf!=null){
            hf.next = null;
        }


    }
}
