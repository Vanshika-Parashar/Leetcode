class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        int n=nums.length;
        
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        if(sum%2!=0)return false;
        int t=sum/2;
        int[][]dp=new int[n][t+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int ans= find(nums,t,dp,0);
        if(ans==1)return true;
        return false;
    }
    public int find(int []nums,int t,int[][]dp,int i){
       if(i==nums.length){
        if(t==0)return 1;
        return 0;
       }
       if(dp[i][t]!=-1)return dp[i][t];
       int skip=find(nums,t,dp,i+1);

       if(nums[i]>t)return dp[i][t]=skip;
       int take= find(nums,t-nums[i],dp,i+1);
       return dp[i][t]=Math.max(take,skip);
    }
}