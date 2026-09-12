class Solution {
    public boolean verify(String s ,int i ,int j){
    int st = i;
    int en = j;
    while(st<en){
        if(s.charAt(st)!= s.charAt(en)) return false;
        st++;
        en--;
    }     
return true;
    }

    public void rec(List<List<String>> ans , List<String> a,String s,int i){
     if(i == s.length()){
        ans.add(new ArrayList<>(a));
        return;
     }
     for(int j= i;j<s.length();j++){
         if(verify(s,i,j)){
            a.add(s.substring(i,j+1));
            rec(ans,a,s,j+1);
            a.remove(a.size()-1);
         }
     }
    }

    public List<List<String>> partition(String s) {
    List<List<String>> ans = new ArrayList<>();
    List<String> a = new ArrayList<>();
    rec(ans,a,s,0);
    return ans;
    }
}
