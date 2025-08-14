public class Top150_109 {

        public ListNode findMid(ListNode head){
            if(head == null || head.next == null){
                return head;
            }
            ListNode slow = head;
            ListNode fast = head.next;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
        public ListNode mergeI(ListNode left, ListNode right){  // Iterative Implementation
            ListNode temp1 = left;
            ListNode temp2 = right;
            ListNode dummy = new ListNode(-1);
            ListNode temp = dummy;
            while(temp1 != null && temp2 != null){
                if(temp1.val <= temp2.val){
                    temp.next = temp1;
                    temp1 = temp1.next;
                }else{
                    temp.next = temp2;
                    temp2 = temp2.next;
                }
                temp = temp.next;
            }
            // Remaining in left
            if(temp1 != null){
                temp.next = temp1;
            }

            // Remaining in right
            if(temp2 != null){
                temp.next = temp2;
            }

            return dummy.next;
        }

        public ListNode merge(ListNode left, ListNode right){  // Recurrsive Implementation
            if (left == null) return right;
            if (right == null) return left;
            if(left.val < right.val){
                left.next = merge(left.next, right);
                return left;
            }else{
                right.next = merge(left, right.next);
                return right;
            }
        }
        public ListNode mergeSort(ListNode head){ // Recurrsive Implementation
            ListNode mid = findMid(head);
            if(head == null || head.next == null){
                return head;
            }
            ListNode left = head;
            ListNode right = mid.next;
            mid.next = null;
            left = mergeSort(left);
            right = mergeSort(right);
            return merge(left, right);
        }
        public ListNode sortList(ListNode head) {
            return mergeSort(head);
        }

}
