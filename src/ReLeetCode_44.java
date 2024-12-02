public class ReLeetCode_44 {
    public static void main(String[] args) {

    }

    int count = 0;
    boolean flag = true;
    public ListNode reverseKGroup(ListNode head, int k) {
        if (flag){
            flag =false;
            ListNode p = head;
            count = getLength(p);
        }
        int b= k;
        ListNode A = head;
        ListNode prev = null;
        ListNode next = A.next;
        while (b>0&&A!=null){
            next = A.next;
            A.next = prev;
            prev = A;
            A = next;
            b--;
        }
        count-=k;
        if (A!=null){
            if (count>=k){
                head.next = reverseKGroup(A,k);
            }else{
                head.next = A;
            }
        }
        return prev;
    }
    public int getLength(ListNode p){
        int c= 0;
        while (p!=null){
            p = p.next;
            c++;
        }
        return c;
    }
}
