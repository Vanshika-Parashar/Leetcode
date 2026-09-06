class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
            while(nums[i]<0 && k>0){
                nums[i]*=-1;
                k--;
            }
        }
            Arrays.sort(nums);
            int sum=0;
            if(k>0){
                if(k%2!=0){
                    nums[0]*=-1;
                }
            }
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
            }
           
             return sum;
        }
    }
