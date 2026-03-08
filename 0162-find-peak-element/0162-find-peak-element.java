class Solution {
    public int findPeakElement(int[] nums) {
        int st=0;
        int end=nums.length-1;
    //     while(st<end){
    //         int mid=st+(end-st)/2;
    //         if(nums[mid]>nums[mid+1]){
    //             end=mid;
    //         }
    //         else{
    //             st=mid+1;
    //         }
            
    //     }
    //    return st;
    int left=0;
    int right=nums.length-1;
    while(left<right){
        int mid=left+(right-left)/2;
        if(nums[mid]>nums[mid+1]){
            right=mid;
        }
        else{
            left=mid+1;
        }
    }
    return left;
}
}