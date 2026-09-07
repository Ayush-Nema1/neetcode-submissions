class Solution {
    public int lastStoneWeight(int[] stones) {
        if(stones.length <= 1) return stones[0];
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
      int i = 0;
      for(int s : stones){
    q.add(s);
      }   
    
     while(q.size() >= 1){
        int x = q.remove();
        int y = q.remove();
       if(x != y) q.add(x-y);
       if(q.size() == 1) return q.peek();
     }
     return q.isEmpty() ? 0 : q.peek();
    }
}
