class Solution {
    public int maxProduct(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int cur=nums[i];
            int oldmax=max;
            int oldmin=min;
            max=Math.max(cur,Math.max(oldmax*cur,oldmin*cur));
            min=Math.min(cur,Math.min(cur*oldmax,cur*oldmin));
            ans=Math.max(ans,max);
        }
        return ans;
    }
}