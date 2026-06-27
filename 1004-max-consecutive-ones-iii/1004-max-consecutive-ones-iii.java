class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        
        int max=0;
        int k2=0;
        for(int j=0;j<n;j++){
            if(nums[j]==0){
                k2++;
            }
            while(k2>k){
                if(nums[i]==0){
                    k2--;
                }
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;

       
        
    }
}