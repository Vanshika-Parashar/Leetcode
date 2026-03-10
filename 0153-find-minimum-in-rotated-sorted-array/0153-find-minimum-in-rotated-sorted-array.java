class Solution {
    public int findMin(int[] nums) {
        // int st=0;
        // int end=nums.length-1;
        // while(st<end){
        //     int mid=st+(end-st)/2;
        //     if(nums[mid]>nums[end] ){
        //         st=mid+1;
        //     }
        //     else {
        //         end=mid;
        //     }
        // }
        // return nums[st];
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>nums[right]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
        
    }
}