class Solution {
    public int minInsertions(String s) {
        StringBuilder a=new StringBuilder(s);
        StringBuilder rev=new StringBuilder(s);
        StringBuilder b=rev.reverse();
        int m=a.length();
        int n=b.length();
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        int ans=lps(m-1,n-1,a,b,dp);
        return s.length()-ans;
    }
    public int lps(int a1,int b1,StringBuilder a,StringBuilder b,int[][]dp){
            if(a1<0 || b1<0)return 0;
            if(dp[a1][b1]!=-1)return dp[a1][b1];
            if(a.charAt(a1)==b.charAt(b1)){
                return dp[a1][b1]=1+lps(a1-1,b1-1,a,b,dp);
            }else{
                return dp[a1][b1]=Math.max(lps(a1,b1-1,a,b,dp),lps(a1-1,b1,a,b,dp));
            }
        }
}