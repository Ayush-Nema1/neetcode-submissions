class Solution {
   static int ans;
    public int dfs(int[][] g ,boolean[][] vis,int i,int j){
         if(i >= g.length || i< 0 || j>=g[0].length || j<0 || vis[i][j] == true || g[i][j] == 0)return 0;

         vis[i][j] = true;
        
        return 1 + dfs(g,vis,i+1,j)+dfs(g,vis,i-1,j) +dfs(g,vis,i,j+1)+dfs(g,vis,i,j-1);
    }
    public int maxAreaOfIsland(int[][] grid) {
         ans = 0;
        int n = grid.length;
        int m = grid[0].length;

        boolean[][] vis = new boolean[n][m];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
            if(!vis[i][j] && grid[i][j] == 1){
              ans = Integer.max(ans,dfs(grid,vis,i,j));
            }
            }
        }     
    return   ans;  
    }
}
