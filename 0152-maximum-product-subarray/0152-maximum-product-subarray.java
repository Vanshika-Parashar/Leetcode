class Solution {
    public int maxProduct(int[] nums) {
       int ans=nums[0];
       int max=nums[0];
       int min=nums[0];
       for(int i=1;i<nums.length;i++){
        int cur=nums[i];
        int oldmax=max;
        int oldmin=min;
        max=Math.max(cur,Math.max(oldmin*cur,oldmax*cur));
        min=Math.min(cur,Math.min(oldmin*cur,oldmax*cur));
        ans=Math.max(ans,max);
       }
       return ans;
    }
}