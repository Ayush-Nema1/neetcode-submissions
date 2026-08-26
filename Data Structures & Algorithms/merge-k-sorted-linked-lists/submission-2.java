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
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)-> a.val - b.val);
        for(ListNode l : lists){
          if(l !=null )  pq.add(l);
        }
        ListNode head = null;
        ListNode tail = null;
 
        while(pq.size() != 0){
            ListNode p = pq.remove();
            if(head == null){
                head = p;
                tail = p;
            }else{
                tail.next = p;
                tail = p;
            }
            if(p.next != null) pq.add(p.next);
               }
               return head;
               
    }
}
