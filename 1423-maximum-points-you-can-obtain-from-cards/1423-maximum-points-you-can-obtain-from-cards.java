class Solution {
    public int maxScore(int[] nums, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];

        }
        int max=sum;
        int i=k-1;
        int j=nums.length-1;
        while(i>=0){
            sum-=nums[i];
            sum+=nums[j];
            i--;
            j--;
            max=Math.max(sum,max);
        }
        return max;
        
    }
}