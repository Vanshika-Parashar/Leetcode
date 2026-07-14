class Solution {
    public int pivotIndex(int[] nums) {
        int[]prefix=new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int n=nums.length;
        if(prefix[n-1]-prefix[0]==0)return 0;
       
        for(int i=1;i<nums.length;i++){
            int leftsum=prefix[i-1];
            int rightsum=prefix[n-1]-prefix[i];
            if(leftsum==rightsum)return i;
        }
        return -1;
        
    }
}