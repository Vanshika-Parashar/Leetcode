class Solution {
    public int change(int amount, int[] coins) {
        int n=coins.length;
        int[][]dp=new int[n][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return find(coins,amount,0,dp);
    }
    public int find(int []coins,int t,int i,int[][]dp){
        if(t==0)return 1;
        if(i==coins.length)return 0;
        if(dp[i][t]!=-1)return dp[i][t];
        int skip=find(coins,t,i+1,dp);
        if(coins[i]>t)return dp[i][t]=skip;
        int take=find(coins,t-coins[i],i,dp);
        return dp[i][t]= take+skip;
    }
}