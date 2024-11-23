public class ReLeetCode_35 {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list2==null){
            return list1;
        } else if (list1==null) {
            return list2;
        }
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode p3 = null;
        if (p1.val>p2.val){
            p3= p2;
            p2 = p2.next;
        }else{
            p3 = p1;
            p1 = p1.next;
        }
        ListNode newHead = p3;
        while (p1!=null&&p2!=null){
            if (p1.val>p2.val){
                p3.next= p2;
                p2 = p2.next;
            }else{
                p3.next = p1;
                p1 = p1.next;
            }
            p3 = p3.next;
        }

        if (p1!=null){
            while (p1!=null){
                p3.next = p1;
                p1 = p1.next;
                p3 = p3.next;
            }
        }else{
            while (p2!=null){
                p3.next = p2;
                p2 = p2.next;
                p3 = p3.next;
            }
        }



        return newHead;
    }
}
