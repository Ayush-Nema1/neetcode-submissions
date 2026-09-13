class Solution {
    public boolean isSafe(int row ,int col ,char ch[][],int n){
         for(int i = row-1;i>=0;i--){
        if(ch[i][col] == 'Q'){
            return false;
        }
       }
       
      
       //diagonal left and right 
       for(int i = row-1,j = col-1;i>=0 && j>= 0;i--,j-- ){
        if(ch[i][j] == 'Q'){
            return false;
        }
        }
            for(int i = row-1,j = col+1;i>=0 && j< n;i--,j++ ){
        if(ch[i][j] == 'Q'){
            return false;
        }
        }
        return true;
    }
    public void rec(List<List<String>> ans,int row ,int n,char b[][]){
       if(row == n){
        ArrayList<String> a = new ArrayList<>();
        for(int  i = 0;i<n;i++){
            a.add(new String(b[i]));
            
        }
        ans.add(a);
        return;
       }
        
        for(int i = 0;i<n;i++){
            if(isSafe(row,i,b,n)){
                b[row][i] = 'Q';
                rec(ans,row+1,n,b);
                b[row][i] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans =  new ArrayList<>();
        char b[][] = new char[n][n];
        for(int i = 0;i<n;i++) Arrays.fill(b[i],'.');
        rec(ans,0,n,b);
        return  ans;
    }
}
