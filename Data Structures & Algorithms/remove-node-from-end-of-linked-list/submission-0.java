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
    public int Size(ListNode temp){
        int s = 0;
        ListNode t = temp;
        while(temp!= null){
            s++;
            temp = temp.next;
        }
        return s;
    }
   public ListNode removeNthFromEnd(ListNode head, int n) {
        int s = Size(head);
         int d = s - n -1;
         if(s==n){
            return head.next;
         }
        ListNode temp = head;
        int i = 0;
        while(i<d){
            temp = temp.next;
            i++;
        }
       if(temp.next!= null){
        temp.next = temp.next.next;
       }
       return head;
    }
}
