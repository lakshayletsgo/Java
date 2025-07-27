public class Top150_65 {
    public ListNode rotateRight(ListNode head, int k) {
        if(k<1||head==null)return head;
        ListNode temp = head;
        ListNode tempHead= null;
        int length = getLength(head,0);
        while(temp.next!=null){
            temp = temp.next;
        }
        int pos = k%length;
        temp.next = head;
        temp = head;
        for(int i=0;i<length-pos-1;i++){
            temp = temp.next;
        }
        tempHead = temp.next;
        temp.next = null;
        return tempHead;
    }


    private int getLength(ListNode head, int co){
        while(head!=null){
            head = head.next;
            co++;
        }return co++;
    }
}
