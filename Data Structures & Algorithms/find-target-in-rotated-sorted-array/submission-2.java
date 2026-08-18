class Solution {
    public int search(int[] nums, int target) {
     int l = 0;
     int r = nums.length-1;
     while(l<r){
        int mid =  l + (r-l)/2;
        if(nums[mid] > nums[r]){
            l = mid+1;
        }else {
            r = mid;
        }
     }   
     int pivot = l;
     l = 0;
     r = nums.length-1;

      while(l<=r){
         int m = l + (r-l)/2;
        int rm = (m+pivot)%nums.length;
        if(nums[rm] == target){
            return rm;
        }else if(nums[rm] > target){
            r = m-1;
        }else{
            l = m+1;
        }
      }
      return -1;
    }
}
