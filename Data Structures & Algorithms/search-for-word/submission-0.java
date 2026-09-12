class Solution {
    public boolean dfs(char[][] board,int wi,int i,int j,String w){
        if(wi == w.length()){
            return true;
        }

        if(i>=board.length || i<0 || j>=board[0].length || j< 0) return false;

        if(wi == w.length()){
            return true;
        }
        
        if( board[i][j] == ' ' || board[i][j] != w.charAt(wi)) return false;
           
           char ch = board[i][j];
          board[i][j] = ' ';

         if(dfs(board,wi+1,i,j+1,w) || dfs(board,wi+1,i+1,j,w) || dfs(board,wi+1,i,j-1,w) || dfs(board,wi+1,i-1,j,w)){
            return true;
         } 
          board[i][j] = ch;
          return false;

    }
    public boolean exist(char[][] board, String word){
          int n = board.length;
      int m = board[0].length;
      for(int i = 0;i<n;i++){
        for(int j = 0;j<m;j++){
           if(word.charAt(0) == board[i][j]){
             boolean found = dfs(board,0,i,j,word);
             if(found){
                return true;
             }
                   }        }
      }
      return false;
    }
}