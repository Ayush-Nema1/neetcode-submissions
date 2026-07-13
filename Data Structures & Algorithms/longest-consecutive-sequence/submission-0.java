class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> map = new HashSet<>();
        for(int n : nums){
            map.add(n);
        }
        int lon = 0;
        for(int n : map){
           
            if(!map.contains(n-1)){
                int curr = n;
               int l = 1;
                while(map.contains(curr+1)){
                    l++;
               curr = curr +1;
                }
            
            lon = Math.max(l,lon);
            }
        }
     return lon;
    }
}
