class Solution {
   public void rec(List<String> ans , String digits,StringBuilder sb,String[] keypad,int wi){
    if(wi == digits.length()){
        ans.add(sb.toString());
        return ;
    }
    char ch = digits.charAt(wi);
    String s = keypad[ch - '0'];
    for(int j = 0;j<s.length();j++){
        sb.append(s.charAt(j));
        rec(ans,digits,sb,keypad,wi+1);
        sb.deleteCharAt(sb.length()-1);
    }

   }
    public List<String> letterCombinations(String digits) {
String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
if(digits.length() ==0) return new ArrayList<String>();
     List<String> ans = new ArrayList<>();
     rec(ans,digits,new StringBuilder(""),keypad,0);
     return ans;
    }
}
