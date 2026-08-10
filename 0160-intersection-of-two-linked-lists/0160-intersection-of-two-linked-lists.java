/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //if(headA==null ||headB==null) return headA;
        ListNode current1=headA, current2=headB;
        while(current1!=current2){
            current1=(current1==null)?headB:current1.next;
            current2=(current2==null)?headA:current2.next;
        }
        return current1;
    }
}