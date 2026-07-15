class Solution {
    public String minWindow(String s, String t) {
           if(s.length() < t.length()) return "";
        HashMap<Character,Integer> map = new HashMap<>();

        for(int i = 0;i<t.length();i++){
            map.put(t.charAt(i) , map.getOrDefault(t.charAt(i),0)+1);
        }
        int len = 0;
        int ans = Integer.MAX_VALUE;
        int st = 0;
        int l = 0;
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            
          if(map.containsKey(ch) && map.get(ch) > 0){
                len++;
            }
            map.put(ch,map.getOrDefault(ch,0)-1);
            while(len == t.length()){
                if(ans> i-l +1){
                    ans = i-l+1;
                    st = l;
                }
                map.put(s.charAt(l),map.getOrDefault(s.charAt(l),0)+1);
                    if(map.get(s.charAt(l)) > 0){
                    len--;
                }
                     l++; 
            }
        }
              
   return ans == Integer.MAX_VALUE ? "" : s.substring(st, st + ans);
    }
}
