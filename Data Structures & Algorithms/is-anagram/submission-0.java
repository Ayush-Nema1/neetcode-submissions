class Solution {
    public boolean isAnagram(String s, String t) {
      int map[] = new int[26];
      int map1[] = new int[26];
      for(int i = 0;i<s.length();i++){
        map[s.charAt(i) - 'a']++;
      }
      for(int i = 0;i<t.length();i++){
    map1[t.charAt(i) - 'a']++;
      }
      for(int i = 0;i<26;i++){
        if(map1[i] != map[i]){
            return false;
        }
      }
      return true;
    }
}
