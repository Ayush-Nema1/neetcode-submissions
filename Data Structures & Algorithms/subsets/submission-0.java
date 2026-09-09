class Solution {
    public void make( List<List<Integer>>ans, List<Integer> a,int[] nums,int i){
        
        if(i ==  nums.length){
           ans.add(new ArrayList<>(a));
            return;
        }
        a.add(nums[i]);
        make(ans, a, nums, i + 1);
        a.remove(a.size()-1);
        make(ans,a,nums,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        make(ans,a,nums,0);
        return ans;
    }
}
