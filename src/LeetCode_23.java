//https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/
//In this we have to delete the nth element from element
//For that we have to first iterate till end and know how many nodes are there
//Now we can easily run the loop till the node and remove it
public class LeetCode_23 {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        if(head.next ==null && n==1){
            return null;
        }

        ListNode curr = head;
        int p=0;
        while(curr!=null){
            curr = curr.next;
            p++;
        }
        if(n==p){
            head = head.next;
            return head;
        }
        ListNode a = head;
        int t=0;
        while(t<(p-n-1)){
            a= a.next ;
            t++;
        }
        a.next = a.next.next;
        return head;
    }
}
