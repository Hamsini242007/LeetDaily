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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next ==null) return null;
        
        ListNode start=reverse(head);
        if(n==1){
            start= start.next;
        }else{
            ListNode curr=start;
            int i=1;
        
        while(curr!=null && curr.next !=null){
            if(i==n-1){
                curr.next=curr.next.next;
                break;
            }else{
                curr=curr.next;
                i++;
            }
        }
        }
        return reverse(start);
    }
    private ListNode reverse(ListNode start){
        ListNode curr=start, prev=null;
        while(curr !=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
}