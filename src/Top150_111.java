public class Top150_111 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length<=0)return null;
        return helper(lists,0,lists.length-1);
    }
    private ListNode helper(ListNode[]lists,int left,int right){
        if(left==right)return lists[left];
        if(left+1==right)return merge(lists[left],lists[right]);
        int mid = left+(right-left)/2;
        ListNode leftList = helper(lists,left,mid);
        ListNode rightList = helper(lists,mid+1,right);
        return merge(leftList,rightList);
    }
    private ListNode merge(ListNode left, ListNode right){
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while(left!=null&&right!=null){
            if(left.val<right.val){
                curr.next = left;
                curr = curr.next;
                left = left.next;
            }else{
                curr.next = right;
                curr = curr.next;
                right = right.next;
            }
        }
        curr.next = left==null?right:left;
        return temp.next;
    }
}
