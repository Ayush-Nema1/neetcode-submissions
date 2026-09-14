class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int n = grid.length , m = grid[0].length;
        boolean vis[] = new boolean[n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 0)q.add(new int[]{i,j});
            }
        }
        while(!q.isEmpty()){
           int cu[] = q.remove();
        int r = cu[0];
        int c = cu[1];
        int nei[][] = {{r-1,c},{r,c+1},{r+1,c},{r,c-1}};
        for(int[] ne : nei){
            int nr = ne[0];
            int nc = ne[1];

            if(nr<0 || nr>=n || nc < 0 || nc >= m || grid[nr][nc] == -1)continue;
               
           else  if( grid[r][c] + 1 < grid[nr][nc] ) {  grid[nr][nc] = grid[r][c] + 1;
            
            q.add(new int[]{nr,nc});
           }
        } 
        }
        
    }
}
