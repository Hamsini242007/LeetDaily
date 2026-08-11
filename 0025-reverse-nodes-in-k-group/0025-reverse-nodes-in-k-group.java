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
    public ListNode reverseKGroup(ListNode head, int k) {
       if(k==1 || head==null) return head; 
       int len=0;
       ListNode current=head;
       while(current!=null){
        len++;
        current=current.next;
       }
       ListNode dummy=new ListNode(0);
       dummy.next=head;
       ListNode groupPrev=dummy;
       current=head;
       int n=len/k;

       for(int i=0;i<n;i++){
            ListNode groupStart=current,prev=null;
        for(int j=0;j<k;j++){
            ListNode temp=current.next;
            current.next=prev;
            prev=current;
            current=temp;
        }
        groupPrev.next=prev;
        groupPrev=groupStart;
       }
       groupPrev.next=current;
       return dummy.next;
    }
}