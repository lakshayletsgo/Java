public class ReLeetCode_37 {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

//        int len = lengthOfList(head);
//        if (len<=1){
//            return null;
//        }
//        ListNode newHead = head;
//        int temp = 1;
//        while (head!=null&&head.next!=null){
//            if (temp==len-n){
//                head.next = head.next.next;
//                head=head.next;
//            }else{
//                head = head.next;
//            }
//            temp++;
//        }
//
//
//        return newHead;
//    }
//    private int lengthOfList(ListNode head){
//        int l=0;
//        while (head!=null){
//            l++;
//            head = head.next;
//        }
//        return l;
//    }

    ListNode prev = null;
    ListNode slow = head;
    ListNode fast =head;

    for (int i=1;i<=n;i++){
        fast = fast.next;
    }
    if (fast==null) return head.next;
    while (fast!=null){
        prev = slow;
        slow = slow.next;
        fast = fast.next;
    }
    prev.next = slow.next;
    return head;
    }
}
