class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0;
        int max=Integer.MIN_VALUE;
        int k2=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                k2++;
            }
            while(k2>k){
                if(nums[i]==0){
                    k2--;
                }
                i++;
            }
            max=Math.max(j-i+1,max);
        }  
        return max;

        
    }
}