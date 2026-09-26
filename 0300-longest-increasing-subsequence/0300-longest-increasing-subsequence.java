class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[][]dp=new int[n][n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return find(nums,0,-1,dp);
    }
    public int find(int[]nums,int i,int prev,int [][]dp){
        if(i==nums.length)return 0;
        if(dp[i][prev+1]!=-1)return dp[i][prev+1];
        int skip=find(nums,i+1,prev,dp);
        int take=0;
        if(prev==-1 || nums[i]>nums[prev]){
            take=1+find(nums,i+1,i,dp);
        }
        return dp[i][prev+1]=Math.max(take,skip);
    }
}