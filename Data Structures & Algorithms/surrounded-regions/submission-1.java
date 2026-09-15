class Solution {
    public void solve(char[][] board) {
       Queue<int[]> q = new LinkedList<>();
    int n = board.length , m = board[0].length;
       for(int  i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            if( (i == 0 || j ==0 || j ==m-1 || i == n-1) && board[i][j] == 'O' ){
                q.add(new int[]{i,j});
            }
        }
       }
       boolean[][] isSafe = new boolean[n][m];
       int neig[][] = {{-1,0},{0,1},{1,0},{0,-1}};
       while(!q.isEmpty()){
        int s = q.size();
        for(int i = 0;i<s;i++){
            int[] cn = q.remove();
            isSafe[cn[0]][cn[1]] = true;
            for(int[] ne : neig){
                int nr = cn[0] + ne[0];
                int nc = cn[1] + ne[1];

                if(nr >= n || nc>=m || nr<0||nc<0 || board[nr][nc] == 'X' ||  isSafe[nr][nc]) continue;

                else q.add(new int[]{nr,nc});
            }
        }
       }
              for(int  i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
            if(!isSafe[i][j] && board[i][j] == 'O'){
                board[i][j] ='X';
            }
        }
       }
    }
}
