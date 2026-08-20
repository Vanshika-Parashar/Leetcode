class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        return Math.min(find(cost,dp,0,n),find(cost,dp,1,n));
    }
    public int find(int []cost,int[]dp,int i,int n){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        return dp[i]=cost[i]+Math.min(find(cost,dp,i+1,n),find(cost,dp,i+2,n));
    }
}