class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int i=0;
        double max=Integer.MIN_VALUE;

        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(j-i+1>k){
                sum-=nums[i];
                i++;
            }
            if(j-i+1==k){
                double avg=sum/k;
                max=Math.max(avg,max);
            }
        }
        return max;
        
    }
}