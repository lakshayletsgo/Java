
public class ReLeetCode_39 {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return helper(l1,l2,0);
    }
    private ListNode helper(ListNode l1,ListNode l2, int carry){
        if (l1==null&&l2==null&&carry==0){
            return null;
        }
        int val1 = l1!=null?l1.val:0;
        int val2 = l2!=null?l2.val:0;
        int sum = val2+val1+carry;
        carry = sum/10;
        ListNode node = new ListNode(sum%10);
        node.next = helper(l1==null?null:l1.next,l2==null?null:l2.next,carry);
        return node;
    }
}
