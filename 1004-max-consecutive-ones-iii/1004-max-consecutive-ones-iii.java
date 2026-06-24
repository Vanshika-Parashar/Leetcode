class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0;
        int nk=0;
        int len=0;
        int max=0;
        for(int j=0;j<n;j++){
            if(nums[j]==0){
                nk++;
            }
            while(nk>k){
                if(nums[i]==0){
                    nk--;
                }
                i++;
            }
            len=j-i+1;
            max=Math.max(max,len);
        }
        return max;

       
        
    }
}