class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int st=1;
        int end=Integer.MIN_VALUE;
        for(int i:nums){
            end=Math.max(end,i);
        }
        int ans=0;
        while(st<=end){
            int mid=st+(end-st)/2;
            int div=find(nums,mid);
                if(div<=threshold){
                    ans=mid;
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            
        }
        return ans;

    
    }
    public int find(int[]nums,int mid){
        int sum=0;
        for(int i:nums){
            if(i%mid==0){
                sum+=i/mid;
            }else{
                sum+=i/mid+1;
            }
        }
        return sum;
    }
}
    

