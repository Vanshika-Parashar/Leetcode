class Solution {
    public boolean search(int[] nums, int target) {
    //     int st=0;
    //     int end=n.length-1;
    //     while(st<=end){
    //         int mid=st+(end-st)/2;
    //         if(n[mid]==target){
    //             return true;
    //         }
    //         if(n[st]==n[mid] && n[mid]==n[end] ){
    //             st++;
    //             end--;
    //         }
    //         else if(n[st]<=n[mid]){//left sorted 
    //             if(n[st]<=target && target<= n[mid]){
    //                 end=mid-1;
    //             }
    //             else{
    //                 st=mid+1;
    //             }
                
    //     }
    //     else{
    //         if(n[mid]<target && target<=n[end]){
    //             st=mid+1;
    //         }
    //         else{
    //             end=mid-1;
    //         }
    //     }

        
        
    // }
    // return false;
    int lo=0;
    int hi=nums.length-1;
    while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        if(nums[mid]==target){
            return true;
        }
        if(nums[mid]==nums[lo]&& nums[mid]==nums[hi]){
            lo++;
            hi--;
        }
        else if(nums[mid]>=nums[lo]){
            if(nums[mid]>=target && target >=nums[lo]){
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }

        }
        else{
            if(nums[mid]<target && target <=nums[hi]){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        
        
    }
    return false;
}
}