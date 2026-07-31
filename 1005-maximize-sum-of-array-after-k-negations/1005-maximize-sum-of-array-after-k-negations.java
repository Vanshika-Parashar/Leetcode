class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length && k>0){
            if(nums[i]<0){
                nums[i]=-nums[i];
                k--;
                
            }
            i++;
        }
        Arrays.sort(nums);
        if(k>0){
            if(k%2!=0){
                nums[0]=-nums[0];
            }
        }
        int sum=0;
        for(i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}