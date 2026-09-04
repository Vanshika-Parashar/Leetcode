class Solution {
    public int longestSubarray(int[] nums) {
        int zeros=0;
        int i=0;
        int max=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                zeros++;
            }
            if(zeros==1){
                max=Math.max(max,j-i+1);
            }
            while(zeros>1){
                if(nums[i]==0){
                    zeros--;
                }
                i++;
            }
        }
        if(max==0)return nums.length-1;
        return max-1;
    }
}