class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[]dp=new int[cost.length];
        Arrays.fill(dp,-1);
        int n=cost.length;
        return Math.min(find(cost,n-1,dp),find(cost,n-2,dp));
    }
    public int find(int []cost,int i,int[]dp){
        if(i==0 || i==1)return cost[i];
        if(dp[i]!=-1)return dp[i];
        return dp[i]=cost[i]+Math.min(find(cost,i-1,dp),find(cost,i-2,dp));
    }
}