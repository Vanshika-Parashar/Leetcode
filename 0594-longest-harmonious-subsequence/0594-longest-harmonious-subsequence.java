class Solution {
    public int findLHS(int[] nums) {
        int i=0;
        Arrays.sort(nums);
        int max=0;
        for(int j=1;j<nums.length;j++){
           while(nums[j]-nums[i]>1){
            i++;
           }
           if(nums[j]-nums[i]==1){
            max=Math.max(j-i+1,max);
           }
        }
        return max;
        
    }
}