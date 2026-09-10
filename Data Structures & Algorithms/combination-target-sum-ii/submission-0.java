class Solution {
    public void rec (List<List<Integer>> ans , List<Integer> a ,int[] nums ,int sum,int target,int i){
        if(sum== target){
            ans.add(new ArrayList<>(a));
            return ;
        }
        if(sum > target ||  i >= nums.length ) return ;

         a.add(nums[i]);
         rec(ans,a,nums,sum+nums[i],target,i+1);
         a.remove(a.size()-1);
               // DON'T TAKE
        int next = i + 1;

        // skip duplicates
        while (next < nums.length && nums[next] == nums[i]) {
            next++;
        }

         rec(ans,a,nums,sum,target,next);
    }
    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        rec(ans,a,nums,0,target,0);
        return ans;
    }
}
