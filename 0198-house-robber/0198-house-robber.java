class Solution {
    public int rob(int[] nums) {
      int n=nums.length; 
      int[]dp=new int[n];
      Arrays.fill(dp,-1);
      
      return find(nums,dp,0,n);
    }
    public int find(int []nums,int[]dp,int i,int n){
        if(i>=n)return 0;
        if(dp[i]!=-1)return dp[i];
        int take=nums[i]+find(nums,dp,i+2,n);
        int skip=find(nums,dp,i+1,n);
        return dp[i]=Math.max(take,skip);
    }
}