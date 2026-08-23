class Solution {
    public Node copyRandomList(Node head) {

        if(head == null) return null;

        // Step 1: Create copy nodes
        Node temp = head;

        while(temp != null) {
            Node n = temp.next;
            Node nw = new Node(temp.val);

            temp.next = nw;
            nw.next = n;

            temp = temp.next.next;
        }

        // Step 2: Copy random pointers
        temp = head;

        while(temp != null) {
            Node t = temp.next;

            if(temp.random != null) {
                t.random = temp.random.next;
            }

            temp = t.next;
        }

        // Step 3: Separate original and copied list
        Node newHead = head.next;
        temp = head;

        while(temp != null) {
            Node copy = temp.next;

            temp.next = copy.next;

            if(copy.next != null) {
                copy.next = copy.next.next;
            }

            temp = temp.next;
        }

        return newHead;
    }
}