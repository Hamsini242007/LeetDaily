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
    public ListNode middleNode(ListNode head) {
        // ListNode current=head;
        // int len=0;
        // while(current != null){
        //     current=current.next;
        //     len++;
        // }
        // current =head;
        // for(int i=0;i<len/2;i++){
        //     current=current.next;
        // }
        // return current;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Moves 1 step
            fast = fast.next.next;  // Moves 2 steps
        }

        return slow;
    }
}