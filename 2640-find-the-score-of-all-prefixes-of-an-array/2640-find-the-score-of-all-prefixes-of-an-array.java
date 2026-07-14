class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        long[]conver=new long[n];
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            conver[i]=nums[i]+max;
        }
        long[]ans=new long[n];
        ans[0]=conver[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+conver[i];
        }
        return ans;
    }
}