class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        long[][]dp=new long[n][amount+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        long ans=find(coins,amount,dp,0);

        if(ans==Integer.MAX_VALUE)return -1;
        int an=(int)(ans);
        return an;
        }
        public  long find(int[]coins,int am,long [][]dp,int i){
            if(i==coins.length){
                if(am==0)return 0;
                return Integer.MAX_VALUE;
            }
            if(dp[i][am]!=-1)return dp[i][am];
            long skip=find(coins,am,dp,i+1);
            if(am<coins[i])return dp[i][am]=skip;
            long take=1+find(coins,am-coins[i],dp,i);
            return dp[i][am]=Math.min(take,skip);
        }
    
}