class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int tmep=nums[mid];
                nums[mid]=nums[low];
                nums[low]=tmep;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int tem=nums[mid];
                nums[mid]=nums[high];
                nums[high]=tem;
                high--;
            }
        }
       
        
    }
}