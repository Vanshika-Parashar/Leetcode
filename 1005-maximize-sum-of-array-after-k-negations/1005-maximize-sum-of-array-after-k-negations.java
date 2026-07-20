class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;
        while(k>0 && i<nums.length){
            if(nums[i]<0){
                nums[i]=nums[i]*(-1);
                
                k--;
            }
            i++;
        }
        i=0;
        Arrays.sort(nums);
        if(k>0){
            while(k>0){
                nums[i]=nums[i]*(-1);
                k--;
            }
        }
        int sum=0;
        for(i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    }
}