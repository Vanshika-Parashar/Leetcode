class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums){
            sum+=i;

        }
        if(sum%2!=0)return false;
        int t=sum/2;
        int[][]dp=new int[nums.length][t+1];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int ans= find(nums,0,t,dp);
        if(ans==1)return true;
        return false;
    }
    public int find(int []nums,int i,int t,int[][]dp){
        if(i==nums.length){
            if(t==0)return 1;
            return 0;
        }
        if(dp[i][t]!=-1)return dp[i][t];
        int skip=find(nums,i+1,t,dp);
        if(t<nums[i])return dp[i][t]=skip;
        int take=find(nums,i+1,t-nums[i],dp);
        return dp[i][t]=Math.max(take,skip); 
    }
}