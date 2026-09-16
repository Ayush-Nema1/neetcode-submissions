class Solution {
    public void dfs(ArrayList<ArrayList<Integer>> adj ,int curr,boolean vis[]){
        vis[curr] = true;
        
        for(int i = 0;i<adj.get(curr).size();i++){
            int ne = adj.get(curr).get(i);
          if(!vis[ne]){
            dfs(adj,ne,vis);
          }
        }
    }
    public int countComponents(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
    
    for(int i = 0;i<n;i++){
        adj.add(new ArrayList<>());
    }  
    for(int[] e: edges){
        int u = e[0];
        int v = e[1];
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    
    int c = 0;
    boolean vis[] = new boolean[n];
    
    for(int i = 0;i<n;i++){
      if(!vis[i]){ dfs(adj,i,vis); c++;}
    }
    return c;
    }
}
