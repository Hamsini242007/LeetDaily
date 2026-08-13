/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        // Step 1: Create copy nodes and interweave them with original nodes
        // Original: A -> B -> C
        // Interleaved: A -> A' -> B -> B' -> C -> C'
        Node curr = head;
        while (curr != null) {
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Assign random pointers for the copy nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                // The copy node's random points to the copy of curr.random
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate the interwoven list back into original and copied lists
        curr = head;
        Node newHead = head.next;
        Node copyCurr = newHead;

        while (curr != null) {
            curr.next = curr.next.next;
            if (copyCurr.next != null) {
                copyCurr.next = copyCurr.next.next;
            }
            curr = curr.next;
            copyCurr = copyCurr.next;
        }

        return newHead;
    }
}