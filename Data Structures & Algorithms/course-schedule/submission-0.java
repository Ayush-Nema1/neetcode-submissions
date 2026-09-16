class Solution {
    public boolean dfs(int n,ArrayList<ArrayList<Integer>> arr,boolean[] path,boolean vis[]){
    
    vis[n] = true;
    path[n] = true;

    for(int i = 0;i<arr.get(n).size();i++){
         int nei = arr.get(n).get(i);
         if (!vis[nei]) {
                if (dfs(nei, arr, path, vis)) {
                    return true;
                }
            }

            else if (path[nei]) {
                return true; // cycle
            }
        }
    
    path[n] = false;
    return false;
    }
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
         ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        for(int i = 0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
       for(int[] p :prerequisites ){
        int u = p[1];
        int v = p[0];
        adj.get(u).add(v);
       }
       boolean vis[] = new boolean[numCourses];
       boolean s[] = new boolean[numCourses];
       for(int i = 0;i<numCourses;i++){
        if(!vis[i]){
            if(dfs(i,adj,s,vis))return false;  
        }
       }
       return true;
    }
}
