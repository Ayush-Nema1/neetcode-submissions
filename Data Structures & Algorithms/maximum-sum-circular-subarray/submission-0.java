class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int currm = 0;
        int currmin = 0;
        int max = nums[0];
        int min =nums[0];
        int t = 0;
        for(int n: nums){
            t+=n;

            currm = Math.max(n , currm+n);
            max = Math.max(max,currm);

            currmin = Math.min(n,currmin+n);
            min = Math.min(min,currmin);
        }
        if(max < 0){
            return max;
        }
        return Math.max(max,t-min);
    }
}