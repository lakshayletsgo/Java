public class Top150_62 {
    int length = 0;
    boolean flag = true;
    public ListNode reverseKGroup(ListNode head, int k) {
        if(flag){
            flag = false;
            length = getLength(head,0);
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

    private int getLength(ListNode head, int c){
        while(head!=null){
            head= head.next;
            c++;
        }return c;
    }
}
