class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count=0;
        if(k<=1)return count;
        int i=0;
        int mul=1;
        for(int j=0;j<nums.length;j++){
            mul*=nums[j];
            while(mul>=k){
                mul/=nums[i];
                i++;
            }
            if(mul<k){
                count+=j-i+1;
            }
        }
        return count;

        
    }
}