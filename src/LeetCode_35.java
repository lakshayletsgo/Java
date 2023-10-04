//https://leetcode.com/problems/rotate-list/
//In this we have first calculated the length of the list and then moved to the len-rotation  node and then declare it as the head
//And made the next of the prev element of the rotated to be null
class ListNode20 {
    int val;
    ListNode20 next;
    ListNode20() {}
    ListNode20(int val) { this.val = val; }
    ListNode20(int val, ListNode20 next) { this.val = val; this.next = next; }
}
public class LeetCode_35 {
    public static void main(String[] args) {

    }
    public ListNode20 rotateRight(ListNode20 head, int k) {
        if(k<=0||head==null||head.next==null){
            return head;
        }
        ListNode20 last =head;
        int length = 1;
        while(last.next!=null){
            length++;
            last = last.next;

        }
        last.next = head;
        int rotations = k%length;
        int skip = length-rotations;
        ListNode20 newLast= head;
        for(int i=0;i<skip-1;i++){
            newLast  =  newLast.next;
        }
        head = newLast.next;
        newLast.next = null;
        return head;
    }

}
