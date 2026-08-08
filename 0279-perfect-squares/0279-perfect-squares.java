class Solution {
    public int numSquares(int n) {
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        return mins(n,dp);
        
    }
    public int mins(int n,int[]dp){
        if((isperfect(n)))return 1;
        if(dp[n]!=-1)return dp[n];
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=n;i++){
            int c=mins(i*i,dp)+mins(n-i*i,dp);
            min=Math.min(c,min);
        }
        return dp[n]=min;
    }
    public boolean isperfect(int n){
        int sqrt=(int)(Math.sqrt(n));
        return (sqrt*sqrt==n);
    }
    
}