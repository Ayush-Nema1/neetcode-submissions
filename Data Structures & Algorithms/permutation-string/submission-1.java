class Solution {
    public boolean checkInclusion(String s1, String s2) {
    if(s1.length() > s2.length()) return false;
    int maps1[] = new int[26];
    int maps2[] = new int[26];
    for(int i = 0;i<s1.length();i++){
        maps1[s1.charAt(i) - 'a']++;
        maps2[s2.charAt(i) - 'a']++;
    }
    if(Arrays.equals(maps1,maps2)){
        return true;
    }
    for(int i = s1.length();i<s2.length();i++){
        maps2[s2.charAt(i - s1.length())  - 'a']--;
        maps2[s2.charAt(i) - 'a']++;

        if(Arrays.equals(maps2,maps1)){
            return true;
        }
    }
    return false;
    }
}
