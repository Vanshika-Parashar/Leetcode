class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]={-1,-1};
        res[0]=find(nums,target,false);
        if(res[0]!=-1){
            res[1]=find(nums,target,true);
        }
        return res;
    }
    public int find(int[]nums,int tar,boolean s){
        int i=0;
        int j=nums.length-1;
        int idx=-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(nums[mid]==tar){
                idx=mid;
                if(s==false){
                    j=mid-1;
                }
                else{
                    i=mid+1;
                }
            }
            else if(nums[mid]<tar){
                i=mid+1;
            }
            else if(nums[mid]>tar){
                j=mid-1;
            }
        }
        return idx;
    }
}
   
        
    