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
    //    if(k==1 || head==null) return head; 
    //    int len=0;
    //    ListNode current=head;
    //    while(current!=null){
    //     len++;
    //     current=current.next;
    //    }
    //    ListNode dummy=new ListNode(0);
    //    dummy.next=head;
    //    ListNode groupPrev=dummy;
    //    current=head;
    //    int n=len/k;

    //    for(int i=0;i<n;i++){
    //         ListNode groupStart=current,prev=null;
    //     for(int j=0;j<k;j++){
    //         ListNode temp=current.next;
    //         current.next=prev;
    //         prev=current;
    //         current=temp;
    //     }
    //     groupPrev.next=prev;
    //     groupPrev=groupStart;
    //    }
    //    groupPrev.next=current;
    //    return dummy.next;
    if (head == null || k == 1) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode groupPrev = dummy;

        while (true) {
            // 1. Check if there are at least k nodes remaining
            ListNode kth = getKthNode(groupPrev, k);
            if (kth == null) {
                break; // Fewer than k nodes left, keep them as is
            }

            ListNode groupNext = kth.next;  // First node of the next group
            ListNode curr = groupPrev.next; // First node of current group (will become tail)
            ListNode prev = groupNext;     // Points to next group so tail auto-connects!

            // 2. Reverse current k-group
            while (curr != groupNext) {
                ListNode temp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = temp;
            }

            // 3. Update pointers for the next group
            ListNode temp = groupPrev.next; // Old start (now tail)
            groupPrev.next = kth;          // Connect previous part to new head (kth)
            groupPrev = temp;              // Move groupPrev to current group's tail
        }

        return dummy.next;
    }

    // Helper to find the k-th node from current node
    private ListNode getKthNode(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}