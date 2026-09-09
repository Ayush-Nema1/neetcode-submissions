class Solution {
    public void rec(List<List<Integer>> ans , List<Integer> a , int[] nums,int target,int sum,int i){
        if(sum == target){
            ans.add(new ArrayList<>(a));
            return;
        }
        if(i == nums.length || sum > target) return;

 
        a.add(nums[i]);
        rec(ans,a,nums,target,sum+nums[i],i);
        a.remove(a.size()-1);
        rec(ans,a,nums,target,sum,i+1);
    } 

    public List<List<Integer>> combinationSum( int[] nums, int target ) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        rec(ans,a,nums,target,0,0);
        return ans;
    }
}
