class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        for(int i=1; i<k; i++){
            first = first.next;
        }

        ListNode temp = head;
        ListNode second = head;

        for(int i=1; i<k; i++){
            temp = temp.next;
        }

        while(temp.next != null){
            temp = temp.next;
            second = second.next;
        }
        int t = first.val;
        first.val = second.val;
        second.val = t;
        return head;
    }
}
