class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashSet<Integer>set=new HashSet<>();
        int i=0;
        long sum=0;
        long max=Integer.MIN_VALUE;
        for(int j=0;j<nums.length;j++){
            while(set.contains(nums[j])){
                sum-=nums[i];
                set.remove(nums[i]);
                i++;
            }
            sum+=nums[j];
            set.add(nums[j]);
            while(j-i+1>k){
                set.remove(nums[i]);
                sum-=nums[i];
                i++;
            }
            if(j-i+1==k){
                max=Math.max(sum,max);
            }
        }
        if(max==Integer.MIN_VALUE)return 0;
        return max;
        
    }
}