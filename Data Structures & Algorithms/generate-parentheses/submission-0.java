class Solution {
    public void rec(List<String> s,StringBuilder sb ,int n,int o,int c){
         if(sb.length() == 2 * n){
            s.add(sb.toString());
         }
         if(o<n){
            sb.append("(");
            rec(s,sb,n,o+1,c);
            sb.deleteCharAt(sb.length()-1);
         }
         if(c<o){
            sb.append(")");
            rec(s,sb,n,o,c+1);
            sb.deleteCharAt(sb.length()-1);
            
         }
    }
    public List<String> generateParenthesis(int n) {
    List<String> s = new ArrayList<>();
    rec(s,new StringBuilder(""),n,0,0);
    return s;  
    }
}
