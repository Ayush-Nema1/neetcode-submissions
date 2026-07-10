class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i = 0;i<strs.length;i++){
            String s = strs[i];
            char[] arr = s.toCharArray();
         Arrays.sort(arr);
         String ne = new String(arr);
            
           if (map.containsKey(ne)) {
    map.get(ne).add(s);
} else {
    List<String> list = new ArrayList<>();
    list.add(s);
    map.put(ne.toString(), list);
}
        }
      return new ArrayList<>(map.values());
    }
}
