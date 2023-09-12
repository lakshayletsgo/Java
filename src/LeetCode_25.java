//https://leetcode.com/problems/swap-nodes-in-pairs/description/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class LeetCode_25{
    public static void main(String[] args) {

    }
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode pointer = new ListNode();
        pointer.next = head;
        ListNode res = head.next;

        while(pointer.next.next != null){
            ListNode first = pointer.next;
            ListNode second = pointer.next.next;
            ListNode tail = second.next;

            pointer.next = second;
            second.next = first;
            first.next = tail;
            pointer = pointer.next.next;

            if(pointer == null || pointer.next == null) break;
        }

        return res;
    }
}