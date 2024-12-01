import java.util.List;

public class ReLeetCode_43 {
    public static void main(String[] args) {

    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null||lists.length==0){
            return null;
        }
        return mergeKListsHelper(lists,0,lists.length-1);
    }

    private ListNode mergeKListsHelper(ListNode []lists,int start,int end){
        if (start==end){
            return lists[start];
        }
        if (start+1==end){
            return merge(lists[start],lists[end]);
        }
        int mid = start+(end-start)/2;
        ListNode left = mergeKListsHelper(lists,start,mid);
        ListNode right = mergeKListsHelper(lists,mid+1,end);

        return merge(left,right);
    }

    private ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (left!=null&&right!=null){
            if (left.val<right.val){
                cur.next = left;
                left  = left.next;
            }else{
                cur.next = right;
                right = right.next;
            }
            cur = cur.next;
        }
        cur.next = left==null?right:left;
        return dummy.next;

    }
}
