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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode current=head;
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        int a,len=0;
        while( current!=null){
            len++;
            current=current.next;
        }
        k=k%len;
        current=head;
        for(int i=0;i<k;i++){
            while( current.next!=null && current.next.next != null){
                current=current.next;
            }
            ListNode end=current.next;
            current.next=null;
            end.next=dummy.next;
            dummy.next=end;
            current=dummy.next;
        }
        return dummy.next;
    }
}