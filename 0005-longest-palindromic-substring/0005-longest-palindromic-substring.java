class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1)return s;
        int maxlen=1;
        int st=0;
        int end=0;
        boolean[][]dp=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();++i){
            dp[i][i]=true;
            for(int j=0;j<i;++j){
                if(s.charAt(j)==s.charAt(i) && (i-j <=2  || dp[j+1][i-1])){
                    dp[j][i]=true;
                    if(i-j+1>maxlen){
                        maxlen=i-j+1;
                        st=j;
                        end=i;
                    }
                }
            }
        }
        return s.substring(st,end+1);
        
    }
}