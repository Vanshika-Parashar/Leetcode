class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int k1=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                k1++;
            }
            while(k1>k){
                if(nums[i]==0){
                    k1--;
                }
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
        
    }
}