class Solution {
    public int dominantIndex(int[] nums) {
        int large=Integer.MIN_VALUE;
        int found=0;
        for(int i=0;i<nums.length;i++){
            if(large<nums[i]){
                large=nums[i];
                found=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(large<nums[i]*2 && nums[i]!=large)return -1;
        }
        return found;
        
        
    }
}