class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int max=Integer.MIN_VALUE;
        int z=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                z++;

            }
            while(z>1){
                if(nums[i]==0){
                    z--;
                }
                i++;
            }
            max=Math.max(j-i+1,max);
        }
        return max-1;
    }
}