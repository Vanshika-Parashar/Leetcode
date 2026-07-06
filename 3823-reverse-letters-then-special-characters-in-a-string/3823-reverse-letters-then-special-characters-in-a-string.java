class Solution {
    public String reverseByType(String s) {
        char []ch=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<=j){
            if(islower(ch[i] ) && islower(ch[j])){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            else if(islower(ch[i]) && !islower(ch[j])){
                j--;
            }
            else if(!islower(ch[i]) && islower(ch[j])){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        i=0;
        j=ch.length-1;
        while(i<=j){
            if(isspecial(ch[i] ) && isspecial(ch[j])){
                char temp=ch[i];
                ch[i]=ch[j];
                ch[j]=temp;
                i++;
                j--;
            }
            else if(isspecial(ch[i]) && !isspecial(ch[j])){
                j--;
            }
            else if(!isspecial(ch[i]) && isspecial(ch[j])){
                i++;
            }
            else{
                i++;
                j--;
            }
        }
        return new String(ch);
    }
    public boolean islower(char c){
        if(c>='a' && c<='z'){
            return true;
        }
        return false;
       
    }
    public boolean isspecial(char c){
        return !(c>='a' && c<='z');
        
    }
}