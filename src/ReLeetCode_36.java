import java.util.List;

public class ReLeetCode_36 {
    public static void main(String[] args) {
        
    }
    public void reorderList(ListNode head) {
        if(head==null||head.next==null){
            return;
        }
        ListNode mid = findMid(head);
        ListNode midReverse = reverse(mid);
        merge(head,midReverse);
    }
    private ListNode findMid(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while (fast!=null&&fast.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return slow;
    }
    private ListNode reverse(ListNode mid){
        ListNode next = null;
        ListNode prev = null;
        while (mid!=null){
            next = mid.next;
            mid.next = prev;
            prev = mid;
            mid = next;
        }
        return prev;

    }
    private void merge(ListNode h1,ListNode h2){
        while (h2!=null){
            ListNode next = h1.next;
            h1.next = h2;
            h1=  h2;
            h2= next;
        }
    }
}
