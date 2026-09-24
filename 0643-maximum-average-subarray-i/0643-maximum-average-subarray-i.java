class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double avg=Integer.MIN_VALUE;;
        int i=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(j-i+1>k){
                sum-=nums[i];
                i++;
            }
            if(j-i+1==k){
                double a=sum/k;
                avg=Math.max(a,avg);
            }
        }
        return avg;
    }
}