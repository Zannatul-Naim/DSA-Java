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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);
        ListNode t = head;

        int m = 0;

        while(l1 != null || l2 != null) {

            int x, y;
            if(l1 != null) {
                x = l1.val;
                l1 = l1.next;
            } else x = 0;
            
            if(l2 != null) {
                y = l2.val;
                l2 = l2.next;
            } else y = 0;

            t.next = new ListNode((x+y+m)%10);
            t = t.next;
            m = (x+y+m)/10;
        }

        if(m > 0) {
            t.next = new ListNode(m);
        }

        return head.next;
    }
}
