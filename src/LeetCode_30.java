//https://leetcode.com/problems/linked-list-cycle-ii/submissions/
//In this we first calculate the length of the cycle
//Then we move the new s pointer length of the cycle times and then we iterate one by one with new f pointer
//This will result in both pointing to same node that is start of the loop
class ListNode14 {
      int val;
      ListNode14 next;
      ListNode14(int x) {
          val = x;
          next = null;
      }
  }
public class LeetCode_30 {
    public static void main(String[] args) {

    }
public int findLength(ListNode14 head){
        ListNode14 fast = head;
        ListNode14 slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                int leng = 0;
                ListNode14 temp=slow;
                do {
                    temp = temp.next;
                    leng++;
                }while (temp!=slow);
                return leng;
            }
        }
        return 0;
}

    public ListNode14 detectCycle(ListNode14 head) {
        int length =0;
        ListNode14 fast = head;
        ListNode14 slow = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                length = findLength(slow);
                break;
            }

        }
        if(length==0){
            return null;
        }
        ListNode14 f = head;
        ListNode14 s = head;
        for(int i=0;i<length;i++){
            s  =s.next;
        }
        while (s!=f){
            s=  s.next;
            f = f.next;
        }
        return s;
    }

}
