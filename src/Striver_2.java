public class Striver_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return helper(l1,l2,0);
    }
    private ListNode helper(ListNode l1, ListNode l2, int carry){
        if(l1==null&&l2==null&&carry==0)return null;
        int val1 = l1==null?0:l1.val;
        int val2 = l2==null?0:l2.val;
        int sum = val1+val2+carry;
        ListNode temp = new ListNode(sum%10);
        temp.next = helper(l1==null?null:l1.next,l2==null?null:l2.next,sum/10);
        return temp;
    }
}
