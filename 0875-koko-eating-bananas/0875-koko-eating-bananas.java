class Solution {
    public int minEatingSpeed(int[] arr, int h) {
       int st=1;
       int max=Integer.MIN_VALUE;
       for(int i:arr){
        max=Math.max(i,max);
       }
        int ans=0;
        int end=max;
        while(st<=end){
            int mid=st+(end-st)/2;
            long hour=find(mid,arr);
            if(hour<=h){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
}
    public long find(int mid,int[]arr){
        long hour=0;
        for(int i:arr){
            if(i%mid==0){
                hour+=i/mid;
            }
            else{
                hour+=i/mid+1;
            }
        }
        return hour;
    }
}