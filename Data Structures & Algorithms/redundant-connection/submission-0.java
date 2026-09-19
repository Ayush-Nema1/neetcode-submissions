class Solution {

    int ans[] = new int[2];
    public int find(int x,int[] par){
        if(x == par[x]){
            return x;
        }
        return par[x] = find(par[x],par);
    }
    public void union(int a,int b,int[] rank,int[] par){
        int parA = find(a,par);
        int parB = find(b,par);
          if(parA == parB){
             ans[0] = a;
             ans[1] = b;
          }  
        if(rank[parB] == rank[parA]){
            par[parB] = parA;
            rank[parA]++;
        }else if(rank[parA] < rank[parB]){
            par[parA] = parB;
            rank[parB]++;
        }else{
            par[parB] = parA;
            rank[parA]++;
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        ans[0] = 0;
        ans[1] = 1;
        int n  = edges.length;
        int rank[] = new int[n+1];
        int par[] = new int[n+1];
         for(int i = 0;i<=n;i++){
            par[i] = i;
         }
       for(int[] e : edges){
        int a = e[0];
        int b = e[1];
        union(a,b,rank,par);
        
       }
         
return ans;
    }
}
