class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==2){
                        min=Math.min(min,Math.abs(i-j));
                    }
                }
            }
            else if(nums[i]==2){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==1){
                        min=Math.min(min,Math.abs(i-j));
                    }
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}