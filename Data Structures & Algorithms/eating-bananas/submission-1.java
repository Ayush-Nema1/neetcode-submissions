class Solution {
    public int find(int[] arr , int is){
       int ans = 0;
       for(int a : arr){
         ans += (a+is -1 )/is;
       }
       return ans;
    }
    public int minEatingSpeed(int[] piles, int h) {
    int low = 1;
    int high = 0;
    for(int p : piles){
        high = Math.max(p,high);
    }   
    while(low < high){
        int mid = (low + high) /2;
        int isans = find(piles,mid);
        if(isans <= h){
            high = mid;
        }else{
            low = mid + 1;
        }
    }
return low;
    }
}
