class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        StringBuilder a=new StringBuilder(text1);
        StringBuilder b=new StringBuilder(text2);
        int m=a.length();
        int n=b.length();
        int[][]dp=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return find(m-1,n-1,a,b,dp);
    }
    public int find(int a1,int b1,StringBuilder a,StringBuilder b ,int[][]dp){
        if(a1<0 || b1<0)return 0;
        if(dp[a1][b1]!=-1)return dp[a1][b1];
        if(a.charAt(a1)==b.charAt(b1)){
            return dp[a1][b1]=1+find(a1-1,b1-1,a,b,dp);
        }else{
            return dp[a1][b1]=Math.max(find(a1-1,b1,a,b,dp),find(a1,b1-1,a,b,dp));
        }
    }
}