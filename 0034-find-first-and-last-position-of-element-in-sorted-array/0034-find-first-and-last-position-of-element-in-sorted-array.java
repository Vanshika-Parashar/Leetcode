class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]={-1,-1};
        res[0]=find(nums,target,false);
        if(res[0]!=-1){
            res[1]=find(nums,target,true);
        }
        return res;
        
    }
    public int find(int[]nums,int t,boolean s){
        int lo=0;
        int hi=nums.length-1;
        int ans=-1;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(nums[mid]==t){
                ans=mid;
                if(s==false){
                    hi=mid-1;
                }else{
                    lo=mid+1;
                }
            }
            else if(nums[mid]<t){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        return ans;
    }
}
   
        
    