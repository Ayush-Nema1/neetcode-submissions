class Solution {
    public boolean dfs(boolean[] vis,int par,int cur,ArrayList<ArrayList<Integer>> adj){

       vis[cur] = true;
       for(int i = 0;i<adj.get(cur).size();i++){
        int ne = adj.get(cur).get(i);
       if (vis[ne]) {
            if (ne != par)
                return true;
        }
        else {
            if(dfs(vis,cur,ne,adj)){
                return true;
            }
        } 
       }
       return false;
    }
    public boolean validTree(int n, int[][] edges) {
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
    for(int i =0 ;i<n;i++){
          if(!vis[i]){
        if(dfs(vis, -1, i, adj)){
            return false;
        }
        c++;
    }
    }
    if(c >1 ) return false;
    else return true;
    }
}
