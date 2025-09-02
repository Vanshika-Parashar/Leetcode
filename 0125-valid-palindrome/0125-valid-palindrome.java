class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
        StringBuffer x=new StringBuffer();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                x.append(Character.toLowerCase(ch));

            }
       
    }
        String a=x.toString();
        String c=new StringBuffer(a).reverse().toString();
        return a.equals(c);
            
}
}