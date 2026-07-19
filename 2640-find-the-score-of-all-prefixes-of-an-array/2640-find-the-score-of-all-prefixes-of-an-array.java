class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n=nums.length;
        long[]conver=new long[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(nums[i],max);
            conver[i]=nums[i]+max;
        }
        long[]ans=new long[conver.length];
        ans[0]=conver[0];
        for(int i=1;i<n;i++){
            ans[i]=conver[i]+ans[i-1];
        }
        return ans;
    }
}