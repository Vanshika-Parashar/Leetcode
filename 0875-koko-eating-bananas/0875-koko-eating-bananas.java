class Solution {
    public int minEatingSpeed(int[] arr, int h) {
      int st=1;
      int end=Integer.MIN_VALUE;
      for(int i:arr){
        end=Math.max(i,end);
      }
      int ans=0;
      while(st<=end){
        int mid=st+(end-st)/2;
        long total=find(mid,arr);
        if(total<=h){
            ans=mid;
            end=mid-1;

        }else{
            st=mid+1;
        }
      }
      return ans;
    }
    public long find(int mid,int[]nums ){
        long sum=0;
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