class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[]dp=new int[cost.length];
        Arrays.fill(dp,-1);
        int n=cost.length;
        return Math.min(find(cost,n-1,dp),find(cost,n-2,dp));
    }
    public int find(int []cost,int n,int[]dp){
        if(n==0 || n==1)return cost[n];
        if(dp[n]!=-1)return dp[n];
        return dp[n]=cost[n]+Math.min(find(cost,n-1,dp),find(cost,n-2,dp));
    }
}