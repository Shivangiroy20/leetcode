
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;  
        }  

        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }
            tail.next = head;

            final int t= length - (k % length);
            for(int i=0; i<t; i++){
                tail = tail.next;
            }
                ListNode newHead = tail.next;
                tail.next = null;
                return newHead;
            }
        }
    


        
      