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
    public int find(int[]coins,int amount,int i,int[][]dp){
        if(i==coins.length){
            if(amount==0){
                return 1;
            }
            else return 0;
        }
        if(dp[i][amount]!=-1)return dp[i][amount];
        int skip=find(coins,amount,i+1,dp);
        if(coins[i]>amount) return dp[i][amount]= skip;
        int pick=find(coins,amount-coins[i],i,dp);
        return dp[i][amount]= pick+skip;
    }
}