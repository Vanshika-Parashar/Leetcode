class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>st=new Stack<>();
        st.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            char p=s.charAt(i);
            if(!st.isEmpty() && st.peek()==p){
                st.pop();
            }
            
            
            else{
                st.push(p);
            }
            
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        
    }
}