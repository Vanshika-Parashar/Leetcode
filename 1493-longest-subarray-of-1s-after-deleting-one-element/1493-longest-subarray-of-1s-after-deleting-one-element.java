class Solution {
    public int longestSubarray(int[] nums) {
        int zeros=0;
        int i=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                zeros++;
            }
            while(zeros>1){
                if(nums[i]==0){
                    zeros--;
                }
                i++;
            }
            max=Math.max(j-i+1,max);
        }
        if(max==Integer.MIN_VALUE)return 0;
        return max-1;
    }
}