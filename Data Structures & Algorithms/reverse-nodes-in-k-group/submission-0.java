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
        ListNode temp = head;
        int c = 0;

        while(c<k && temp!= null){
            if(temp == null) return head;
            temp =  temp.next;
            c++;
        } 
      if (c < k) return head;
        ListNode prev = reverseKGroup(temp,k);

       
        ListNode curr = head;
        for (int i = 0; i < k; i++) {  // CHANGE 2
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }

        return prev;
    }
}
