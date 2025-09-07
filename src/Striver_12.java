public class Striver_12 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode temp2 = head;
        ListNode prev = null;
        for(int i=1;i<=n;i++)temp = temp.next;
        if(temp==null)return head.next;
        while(temp!=null){
            prev = temp2;
            temp = temp.next;
            temp2 = temp2.next;
        }
        prev.next = temp2.next;
        return head;
    }
}
