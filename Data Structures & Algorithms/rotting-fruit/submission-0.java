class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> q = new LinkedList<>();
        int f = 0;

        int n = grid.length;
        int m = grid[0].length;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(grid[i][j] == 1) f++;
                else if(grid[i][j] == 2) q.add(new int[]{i,j});
            }
        }
        if(f <=0) return 0;
    int time = 0;

    while(!q.isEmpty()){
        int s = q.size();
        int t = 0;
        for(int i = 0;i<s;i++){

        int[] cu = q.remove();
        int r = cu[0];
        int c = cu[1];

        int nei[][] = {{r-1,c},{r,c+1},{r+1,c},{r,c-1}};

        for(int[] ne : nei){
           int nr = ne[0]; 
           int nc = ne[1];

           if(nr>=n||nr<0||nc>=m||nc<0||grid[nr][nc]==2||grid[nr][nc]==0) continue;

           grid[nr][nc] = 2; 
           f--;
           q.add(new int[]{nr,nc});
           if(f == 0){
                return time +1 ;
            }
        }
       
        
        }
        time +=1;
    }
return f == 0 ? time : -1;
    }
}
