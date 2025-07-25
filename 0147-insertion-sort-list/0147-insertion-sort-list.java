class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy  = new ListNode(0);
        ListNode prev  = dummy;

        while(head != null){
            ListNode next  = head.next;
            if(prev.val >= head.val)
            prev  = dummy;
            while(prev.next != null && prev.next.val < head.val)
            prev = prev.next;
            head.next  = prev.next;
            prev.next  = head;
            head = next;
        }
        return dummy.next;
    }
}