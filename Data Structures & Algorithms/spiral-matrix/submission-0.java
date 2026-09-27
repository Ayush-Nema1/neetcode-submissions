class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
     int sr = 0;
     int sc = 0;
     int er = matrix.length-1;
     int ec = matrix[0].length-1 ;
      ArrayList<Integer> ans = new ArrayList<>();
     while(sr<=er && sc <= ec){
        for(int i = sr;i<=ec;i++){
              ans.add(matrix[sr][i]);
        }

        for(int j = sr+1;j<=er;j++){
            ans.add(matrix[j][ec]);
        }
          if(sr<er){
            for(int i = ec-1;i>=sc;i--){
            ans.add(matrix[er][i]);
        }
          }
          if(sc<ec){
             for(int i = er-1;i>=sr+1;i--){
          ans.add(matrix[i][sc]);
             }
        }
        sr++;
        er--;
        sc++;
        ec--;
     }
    return ans;
    }
}
