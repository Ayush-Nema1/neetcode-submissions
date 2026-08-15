class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<>();
        int k = temperatures.length-1;
        int ans[] = new int[k+1];
        for(int i =temperatures.length-1;i>=0;i--){
            while(!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ans[k--] = 0;
            }else{
                ans[k--] = s.peek() - i;
            }
            s.add(i);
        }
        return ans;
    }
}
