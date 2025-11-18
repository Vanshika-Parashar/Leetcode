class Solution {
    public boolean canJump(int[] nums) {
        int reach=0;
        for(int i=0;i<nums.length;i++){
            if(i>reach){
                return false;
            }
            reach=Math.max(reach,i+nums[i]);
        }
        return true;
        // int reach=arr.length-1;
        // for(int i=arr.length-1;i>=0;i--){
        //     if(i+arr[i]>=reach){
        //         reach=i;
        //     }
        // }
        // return reach==0;
    }
}