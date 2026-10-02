class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0)return 0;
        int i=0;
        int max=1;
        int count=1;

        for(int j=1;j<nums.length;j++){
            if(nums[j]==nums[j-1])continue;
           if(nums[j]==nums[j-1]+1){
            count++;
           }else{
            count=1;
           }
            max=Math.max(count,max);

        }
        return max;
    }
}