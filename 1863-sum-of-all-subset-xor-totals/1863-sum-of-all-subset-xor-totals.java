class Solution {
    public int subsetXORSum(int[] nums) {
        int count=0;
        return find(nums,0,0);
    }
    public int find(int[]nums,int idx,int count){
       int ans=count;
        for(int i=idx;i<nums.length;i++){
           
            ans+=find(nums,i+1,count^nums[i]);
        }
        return ans;
    }
    
}