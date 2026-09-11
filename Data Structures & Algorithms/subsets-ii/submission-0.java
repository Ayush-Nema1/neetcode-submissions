class Solution {
    public void rec(List<List<Integer>> ans , List<Integer> a, int nums[] ,int i){

        if(i == nums.length){
            ans.add(new ArrayList<>(a));
            return;
        }
        a.add(nums[i]);
        rec(ans,a,nums,i+1);
        a.remove(a.size()-1);
    int n = i+1;
    while(n<nums.length &&nums[n] == nums[i]){
      n++;
    }
        rec(ans,a,nums,n);
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
          List<List<Integer>> ans = new ArrayList<>();
        List<Integer> a = new ArrayList<>();
        rec(ans,a,nums,0);
        return ans;
    }
}
