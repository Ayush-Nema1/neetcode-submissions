class Solution {
    class Pair implements Comparable<Pair> {
        int n;
        int freq;
        public Pair(int n,int freq){
            this.n = n;
            this.freq = freq;
        }
        @Override
        public int compareTo(Pair p2){
            return this.freq - p2.freq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for(int i= 0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       for (int key : map.keySet()) {
    pq.add(new Pair(key, map.get(key)));

    if (pq.size() > k) {
        pq.poll();
    }
}
        int ans[] = new int[k];
        for(int i = 0;i<k;i++){
            ans[i] = pq.remove().n;
        }
        return ans;
    }
}
