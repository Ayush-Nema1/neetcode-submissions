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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
         ListNode dummy = new ListNode(-1);
         ListNode t = dummy;
         int carry = 0;
        while(t1 != null && t2 != null){
          
         int s  = t1.val + t2.val + carry;
          carry = s / 10;
         s %= 10;
         ListNode nw = new ListNode(s);
        t.next = nw;
        t = t.next;
        t1 = t1.next;
        t2 = t2.next;
        }
        while(t1!= null && t2 == null){
          int s  = t1.val  + 0 +  carry;
          carry = s / 10;
         s %= 10;
         ListNode nw = new ListNode(s);
        t.next = nw;
        t = t.next;
        t1 = t1.next;
        }
        while(t1== null && t2 != null){
          int s  = t2.val  + 0 +  carry;
          carry = s / 10;
         s %= 10;
                 ListNode nw = new ListNode(s);
        t.next = nw;
        t = t.next;
        t2 = t2.next;
        }
        
        if(carry != 0 ){
            ListNode nw = new ListNode(carry);
            t.next = nw;
            t = t.next; 
        }
        return dummy.next;
    }
}
