class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double max=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        int i=0;
        max=sum/k;
        for(int j=k;j<nums.length;j++){
            sum+=nums[j];
            while(j-i+1>k){
                sum-=nums[i];
                i++;
                max=Math.max(max,sum/k);
            }
        }
        return max;
    }
}