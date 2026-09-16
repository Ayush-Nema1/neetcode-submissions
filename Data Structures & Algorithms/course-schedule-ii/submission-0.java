class Solution {
    public int[] findOrder(int n, int[][] pr) {
    ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
    for(int i = 0;i<n;i++){
        arr.add(new ArrayList<>());
    } 
    for(int[] p :pr ){
        int u = p[0];
        int v = p[1];
        arr.get(v).add(u);
    }
    int in[] = new int[n];
    for(int i = 0;i<pr.length;i++){
        in[pr[i][0]]++;
    }
    Queue<Integer> q = new LinkedList<>();
   for(int i = 0;i<n;i++){
    if(in[i] == 0) q.add(i);
   }
   int ans[] = new int[n];
   int c = 0;
   int k = 0;
   while(!q.isEmpty()){
    int curr = q.remove();
    ans[k++] = curr;
c++;
    for(int i = 0;i<arr.get(curr).size();i++){
        int ne = arr.get(curr).get(i);
        in[ne]--;
        if(in[ne] == 0){
            q.add(ne);
        }
    }
    
       }
 if(c == n) return ans;
    else return new int[]{};
}}
