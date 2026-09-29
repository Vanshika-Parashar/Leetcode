class Solution {
    public int coinChange(int[] coins, int amount) {
        long[][]dp=new long[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        long ans=find(coins,amount,dp,0);
        if(ans==Integer.MAX_VALUE)return -1;
        int an=(int)(ans);
        return an;
        
    }
    public long find(int []nums,int t,long[][]dp,int i){
        if(i==nums.length){
            if(t==0)return 0;
            return Integer.MAX_VALUE;

        }
        if(dp[i][t]!=-1)return dp[i][t];
        long skip=find(nums,t,dp,i+1);
        if(t<nums[i])return dp[i][t]=skip;
        long take=1+find(nums,t-nums[i],dp,i);
        return dp[i][t]=Math.min(take,skip);
    }
}