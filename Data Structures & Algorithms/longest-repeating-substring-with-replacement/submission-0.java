class Solution {
    public int characterReplacement(String s, int k) {
        int map[] = new int[26];
                int maxfreq = 0;
        int j  =0;
        int ans = 0;
        for(int i = 0;i<s.length();i++){
          map[s.charAt(i) - 'A']++;
        maxfreq = Math.max(maxfreq,map[s.charAt(i)-'A']);
        while(i-j+1 - maxfreq > k){
            map[s.charAt(j)-'A']--;
            j++;
        }
           ans = Math.max(ans,i-j+1);
        } 
        return ans;
    }
}
