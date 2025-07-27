public class Top150_66 {
    public ListNode partition(ListNode head, int x) {
        ListNode pointer1 = new ListNode();
        ListNode head1 = pointer1;
        ListNode pointer2 = new ListNode();

        ListNode head2 = pointer2;
        ListNode temp = head;

        while(temp!=null){
            if(temp.val<x){
                head1.next = temp;
                head1 = head1.next;
            }else{
                head2.next = temp;
                head2= head2.next;
            }
            temp = temp.next;
        }
        head1.next = pointer2.next;
        head2.next = null;

        return pointer1.next;
    }
}
