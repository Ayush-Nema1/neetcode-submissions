class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();

        for(String st : tokens){
            if(st.equals("+")){
                int b = s.pop();
                int a = s.pop();
                s.push(b + a);
            }
            else if(st.equals("*")){
                   int b = s.pop();
                int a = s.pop();
                s.push(b * a);
            }
            else if(st.equals("/")){
                int b = s.pop();
                int a = s.pop();
                s.push(a/b);
            }
            else if(st.equals("-")){
                int b = s.pop();
                int a = s.pop();
                s.push(a - b);
            }
            else s.push(Integer.parseInt(st));
        }
        return s.pop();
    }
}
