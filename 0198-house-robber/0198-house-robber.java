class Solution {
    public int rob(int[] nums) {
      int n=nums.length;
      int[]dp=new int[n];
      Arrays.fill(dp,-1);
      return find(nums,0,dp);
    }
    public int find(int []nums,int i,int[]dp){
        if(i>=nums.length)return 0;
        if(dp[i]!=-1)return dp[i];
        int skip=find(nums,i+1,dp);
        int take=nums[i]+find(nums,i+2,dp);
        return dp[i]=Math.max(take,skip);

    }
}