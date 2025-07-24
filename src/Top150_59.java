public class Top150_59 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)return list2;
        else if(list2==null)return list1;

        ListNode pointer1= list1;
        ListNode pointer2= list2;
        ListNode pointer3= null;
        if(pointer1.val<pointer2.val){
            pointer3 = pointer1;
            pointer1=pointer1.next;
        }else{
            pointer3 = pointer2;
            pointer2=pointer2.next;

        }
        ListNode result = pointer3;
        while(pointer1!=null&&pointer2!=null){
            if(pointer1.val>pointer2.val){
                pointer3.next =pointer2;
                pointer3 = pointer3.next;
                pointer2 = pointer2.next;
            }else {
                pointer3.next =pointer1;
                pointer3 = pointer3.next;
                pointer1= pointer1.next;
            }
        }
        while(pointer1!=null){
            pointer3.next = pointer1;
            pointer3 = pointer3.next;
            pointer1 = pointer1.next;
        }
        while(pointer2!=null){
            pointer3.next = pointer2;
            pointer3 = pointer3.next;
            pointer2 = pointer2.next;
        }
        return result;
    }
}
