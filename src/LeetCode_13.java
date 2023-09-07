//https://leetcode.com/problems/reverse-linked-list-ii/
public class LeetCode_13 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode left2=head,left1=head,right1=head,right2=head;
        int l=left;

        if (head==null)
            return null;
        if (head.next==null)
            return head;


        while(left-->1){
            left1=left2;
            left2=left2.next;
        }

        while(right-->=1){
            right2=right1;
            right1=right1.next;
        }

        if (l!=1)
            left1.next=null;

        right2.next=null;

        ListNode prev=null,next=null,curr=left2;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        if (l==1){
            head.next=right1;
            return prev;
        }

        left1.next=prev;
        left2.next=right1;

        return head;
    }
}