public class Striver_15 {
    int length= 0;
    boolean flag = true;
    public ListNode reverseKGroup(ListNode head, int k) {
        if(flag){
            flag = false;
            length = getLength(head);
        }
        int temp = k;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = curr.next;
        while(temp>0&&curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            temp--;
        }
        length-=k;
        if(curr!=null){
            if(length>=k)head.next = reverseKGroup(curr,k);
            else head.next = curr;
        }
        return prev;
    }
    private int getLength(ListNode head){
        int len=0;
        while(head!=null){
            head = head.next;
            len++;
        }
        return len;
    }
}
