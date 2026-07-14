class Solution {
    public int splitArray(int[] nums, int k) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            sum+=i;
            max=Math.max(i,max);

        }
        int ans=0;
        int st=max;
        int end=sum;
       while(st<=end){
        int mid=st+(end-st)/2;
        int subarray=find(mid,nums);
        if(subarray<=k){
            ans=mid;
            end=mid-1;
        }
        else{
            st=mid+1;
        }
       }
       return ans;
    }
    public int find(int mid,int[]nums){
        int subarray=1;
        int sum=0;
        for(int i:nums){
            if(sum+i<=mid){
                sum+=i;
            }
            else{
                subarray++;
                sum=i;
            }
        }
        return subarray;
    }
}