class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int sum=0;
        for(int i:nums){
            sum+=i;
        }

        if(sum%2!=0)return false;
        int t=sum/2;
        int[][]dp=new int[n][t+1];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int ans=find(nums,t,0,dp);
        if(ans==0)return false;
        return true;
    }
    public int find(int[]nums,int t,int i,int[][]dp){
        if(t==0)return 1;
        if(i==nums.length)return 0;
        if(dp[i][t]!=-1)return dp[i][t];
        int skip=find(nums,t,i+1,dp);
        if(nums[i]>t)return dp[i][t]=skip;
        int take=find(nums,t-nums[i],i+1,dp);
        return dp[i][t]=Math.max(take,skip);
    }
}