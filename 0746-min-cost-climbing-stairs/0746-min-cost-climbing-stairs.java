class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[]dp=new int[cost.length];
        Arrays.fill(dp,-1);
        int n=cost.length;
        return Math.min(find(cost,n-1,dp),find(cost,n-2,dp));
    }
    public int find(int []cost,int idx,int[]dp){
        if(idx==0 || idx==1)return cost[idx];
        if(dp[idx]!=-1)return dp[idx];
        return dp[idx]=cost[idx]+Math.min(find(cost,idx-1,dp),find(cost,idx-2,dp));
    }
}