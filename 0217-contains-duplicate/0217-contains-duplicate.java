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
        HashSet<Integer>num=new HashSet<>();
        for(int i=0;i<n;i++){
            if(num.contains(nums[i])){
                return true;
            }
            else{
                num.add(i);
            }
        }
        return false;
        
    }
}