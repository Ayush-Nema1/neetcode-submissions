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
    public ListNode mergeKLists(ListNode[] lists) {
  PriorityQueue<ListNode>pq = new PriorityQueue<>((a,b) -> a.val-b.val);

       for(ListNode ptr : lists){
       if(ptr != null) pq.add(ptr);
       }
       ListNode head = null , tail = null;
       while(pq.size() != 0){
        ListNode p = pq.remove();
        if(head == null){
            head = tail = p;
        }else{
            tail.next = p;
            tail = tail.next;
        }
        if(p.next != null) pq.add(p.next);
       }
       return head;
    }
}
