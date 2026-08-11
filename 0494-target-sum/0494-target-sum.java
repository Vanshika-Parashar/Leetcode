class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return find(nums,target,0);
    }
    public int find(int[]nums,int t,int i){
        if(i==nums.length){
            if(t==0){
                return 1;
            }
            else return 0;

        }
        //when sign - ka ho
        int add=find(nums,t+nums[i],i+1);
        //when sign +ho
        int substract=find(nums,t-nums[i],i+1);
        return add+substract;
    }
}