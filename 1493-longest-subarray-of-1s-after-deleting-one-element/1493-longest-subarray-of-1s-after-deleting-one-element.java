class Solution {
    public int longestSubarray(int[] nums) {
        int k2=0;
        int i=0;
        int max=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                k2++;
            }
            while(k2>1){
                if(nums[i]==0){
                    k2--;
                }
                i++;
            }
            max=Math.max(j-i+1,max);
        }
        return max-1;
        
    }
}