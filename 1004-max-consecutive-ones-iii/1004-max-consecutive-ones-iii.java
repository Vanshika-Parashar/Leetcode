class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int j=0;
        int max=0;
        int k2=0;
        while(j<n){
            while(j<n && k2<=k){
                if(nums[j]==0){
                    k2++;
                }
                if(k2<=k){
                    max=Math.max(j-i+1,max);
                }
                j++;
            }
            if(j==n)break;
            while(i<n && k2>k){
                if(nums[i]==0){
                    k2--;
                }
                i++;
            }
        }
        return max;

       
        
    }
}