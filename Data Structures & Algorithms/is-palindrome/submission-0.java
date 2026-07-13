class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }
        sb.toString();
        int o = 0;
        int l = sb.length()-1;
        while(o<l){
            if(sb.charAt(o) != sb.charAt(l)){
                return false;
            }
            o++;
            l--;
        }
        return true;
    }
}
