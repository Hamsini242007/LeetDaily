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
        int len=0;
        while( current!=null){
            len++;
            current=current.next;
        }
        k=k%len;
        if(k==0) return head;
        int i=len-k;
        current=head;
        for(int j=0;j<i-1;j++){
            current=current.next;
        }
        dummy.next=current.next;
        ListNode s=current.next;
        while(s.next!=null){
            s=s.next;
        }
        current.next=null;
        s.next=head;
        return dummy.next;
        // if(head==null || head.next==null) return head;
        // ListNode current=head;
        // ListNode dummy= new ListNode(0);
        // dummy.next=head;
        // int len=0;
        // while( current!=null){
        //     len++;
        //     current=current.next;
        // }
        // k=k%len;
        // current=head;
        // for(int i=0;i<k;i++){
        //     while( current.next!=null && current.next.next != null){
        //         current=current.next;
        //     }
        //     ListNode end=current.next;
        //     current.next=null;
        //     end.next=dummy.next;
        //     dummy.next=end;
        //     current=dummy.next;
        // }
        // return dummy.next;
    }
}