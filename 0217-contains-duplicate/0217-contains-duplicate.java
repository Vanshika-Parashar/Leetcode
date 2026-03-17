class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return false;

       
        
        

        
    }
}