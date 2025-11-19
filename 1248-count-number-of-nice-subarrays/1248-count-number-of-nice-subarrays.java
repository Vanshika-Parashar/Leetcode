class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int ans1=count(nums,k);
        int ans2=count(nums,k-1);
        int ans=ans1-ans2;
        return ans;

        
    }
    public static int count(int []nums,int k){
        int l=0;
        int r=0;
        int sum=0;
        int res=0;
        while(r<nums.length){
            if(nums[r]%2!=0){
                sum++;
            }
            while(sum>k){
                if(nums[l]%2!=0){
                    sum--;
                }
                l++;

            }
            res=res+(r-l+1);
            r++;

        }
        return res;
    }
}