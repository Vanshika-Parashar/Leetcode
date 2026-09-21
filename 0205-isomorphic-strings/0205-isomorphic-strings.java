class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        char []ch=new char[128];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char d=t.charAt(i);
            int idx=(int)c;
            if(ch[c]=='\0'){
                ch[c]=d;
            }else{
                if(ch[c]!=d)return false;
            }
        }
        for(int i=0;i<128;i++){
            ch[i]='\0';
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char d=t.charAt(i);
            int idx=(int)d;
            if(ch[d]=='\0'){
                ch[d]=c;
            }else{
                if(ch[d]!=c)return false;
            }
        }
        return true;

        
    }
}