public class Top150_61 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||head.next==null)return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;
        for(int i=0;i<left-1;i++)prev = prev.next;
        ListNode curr = prev.next;
        for(int i=0;i<right-left;i++){
            ListNode currNext = curr.next;
            curr.next = currNext.next;
            currNext.next = prev.next;
            prev.next= currNext;
        }
        return dummy.next;

    }
}
