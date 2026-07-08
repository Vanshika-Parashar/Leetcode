class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int count=0;
        for(int j=0;j<nums.length;j++){
             while(nums[j]-nums[i]>1){
                i++;
            }
            if(nums[j]-nums[i]==1){
                
                count=Math.max(count,j-i+1);
            }
            
            
            
        }
        return count;
        
    }
}