class Solution {
    public int maxProduct(int[] nums) {
      int max=nums[0];
      int min=nums[0];
      int ans=nums[0];
      for(int i=1;i<nums.length;i++){
        int oldmax=max;
        int oldmin=min;
        int cur=nums[i];
        max=Math.max(cur,Math.max(oldmax*cur,oldmin*cur));
        min=Math.min(cur,Math.min(oldmin*cur,oldmax*cur));
        ans=Math.max(max,ans);
      }
      return ans;
    }
}