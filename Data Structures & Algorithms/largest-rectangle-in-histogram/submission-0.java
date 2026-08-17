class Solution {
    public int largestRectangleArea(int[] arr) {
        Stack<Integer> s = new Stack<>();
        int n = arr.length;
        int nextSmallerL[] = new int[n];
        int nextSmallerR[] = new int[n];
        int k = n-1;
        for(int i = n-1;i>=0;i--){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerR[k] = n;
            }else{
                nextSmallerR[k] = s.peek();
            }
            k--;
            s.add(i);
        }
        k = 0;
       s = new Stack<>();
         for(int i = 0;i<n;i++){
            while(!s.isEmpty() && arr[s.peek()] >= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextSmallerL[k] = -1;
            }else{
                nextSmallerL[k] = s.peek();
            }
            k++;
            s.add(i);
        }
        int ans = Integer.MIN_VALUE;
        for(int i = 0;i<n;i++){
            int h = arr[i];
            int width = nextSmallerR[i] - nextSmallerL[i] - 1;
            int area = h * width;
            ans = Math.max(ans,area);
        }
        return ans;
    }
}
