class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()==0){
            return true;
        }
        StringBuffer x=new StringBuffer();
    //     for(int i=0;i<s.length();i++){
    //         char ch=s.charAt(i);
    //         if(Character.isLetterOrDigit(ch)){
    //             x.append(Character.toLowerCase(ch));

    //         }
       
    // }
    //     String a=x.toString();
    //     String c=new StringBuffer(a).reverse().toString();
    //     return a.equals(c);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(isaphanumeric(ch)){
                x.append(Character.toLowerCase(ch));
            }
        }
        String a=x.toString();
        String c=new StringBuffer(x).reverse().toString();
        return a.equals(c);
        
            

}
public boolean isaphanumeric(char ch){
    if(ch>=48 && ch<=57)return true;
    else if(ch>=65 && ch<=90)return true;
    else if(ch>=97 && ch<=122)return true;
    return false;
}
}