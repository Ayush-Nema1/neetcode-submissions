class Solution {
    public int maxSubArray(int[] nums) {
        int ans = 0;
        int max = nums[0];
        int sum = 0;
        for(int i = 0;i<nums.length;i++){
            sum = nums[i] + sum;
            max = Integer.max(max,sum);
            if(sum <0 ){
                sum = 0;
            }
        }
        return max;
         }
}
