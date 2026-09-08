class Solution {
    public int leastInterval(char[] tasks, int n) {
     int map[] = new int[26];
     PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
     for(int i = 0;i<tasks.length;i++){
        int  curr = tasks[i] - 'A';
           map[curr]++;
     }
     for(int i = 0;i<map.length;i++){
         if(map[i] > 0) pq.add(map[i]);
     }
     int time = 0;
    while(!pq.isEmpty()){
    ArrayList<Integer> reenter = new ArrayList<>();
    int t = 0;
    for(int i = 0;i<=n && !pq.isEmpty();i++){
    int freq = pq.remove();
    freq--;
    t++;

    if(freq > 0) reenter.add(freq);
    }
 time += reenter.isEmpty() ? t : n + 1;
   for (int freq : reenter) {
                pq.add(freq);
            }
    } 
    return time;
    }
}
