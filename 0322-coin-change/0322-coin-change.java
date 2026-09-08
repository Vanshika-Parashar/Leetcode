class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        long[][]dp=new long[n][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        long ans=find(coins,amount,0,dp);
        if(ans==Integer.MAX_VALUE)return -1;
        int an=(int)(ans);
        return an-1;
        
    }
    public long find(int[]coins,int t,int i,long[][]dp){
        if(t==0)return 1;
        if(i==coins.length)return Integer.MAX_VALUE;
        if(dp[i][t]!=-1)return dp[i][t];
        long skip=find(coins,t,i+1,dp);
        if(coins[i]>t)return dp[i][t]=skip;
        long take=1+find(coins,t-coins[i],i,dp);
        return dp[i][t]=Math.min(skip,take);
    }
    
}