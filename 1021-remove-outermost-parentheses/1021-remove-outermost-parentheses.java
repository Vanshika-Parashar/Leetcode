class Solution {
    public String removeOuterParentheses(String s) {
        int balance=0;
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if(balance>0){
                    st.push('(');
                }
                
                balance++;
            }else{
                balance--;
                if(balance>0){
                    st.push(')');
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        
    }
}