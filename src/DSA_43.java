//Find the length of the cycle
// In this we again use the fast and slow pointer method
//In this we will run a loop when the slow and fast pointer is met

class ListNode13 {
    int val;
    ListNode13 next;
    ListNode13(int x) {
        val = x;
        next = null;
    }
}
public class DSA_43 {
    public static void main(String[] args) {
        ListNode13 l1 = new ListNode13(2);
        ListNode13 l2 = new ListNode13(3);
        ListNode13 l3 = new ListNode13(4);
        ListNode13 l4 = new ListNode13(5);
        ListNode13 l5 = new ListNode13(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l3;
        System.out.println(findLength(l1));
    }
    static int findLength(ListNode13 head){
        ListNode13 fast = head;
        ListNode13 slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow= slow.next;
            if(slow==fast){
                int length = 0;
                ListNode13 temp = slow;
                do{
                    length++;
                    temp = temp.next;
                }while (temp!=slow);
                return length;
            }
        }
        return 0;
    }
}
