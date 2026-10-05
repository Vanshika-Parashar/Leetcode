class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]ans=new int[2];
        int i=0;
        int r=nums.length-1;
        while(i<r){
            if(nums[i]+nums[r]==target){
                ans[0]=i+1;
                ans[1]=r+1;
                i++;
                r--;
            }
            else if(nums[i]+nums[r]<target){
                i++;
            }else{
                r--;
            }
        }
        return ans;

    }
}