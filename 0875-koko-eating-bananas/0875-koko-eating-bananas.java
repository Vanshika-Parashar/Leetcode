class Solution {
    public int minEatingSpeed(int[] arr, int h) {
       int st=1;
       int end=Integer.MIN_VALUE;
       for(int i=0;i<arr.length;i++){
        if(arr[i]>end){
            end=arr[i];
        }
       }
       int ans=end;
       while(st<=end){
        int mid=st+(end-st)/2;
        long count=0;
        for(int i=0;i<arr.length;i++){
            int n=arr[i];
            count += (n + mid - 1) / mid;
            }
            if(count<=h){
            ans=mid;
            end=mid-1;
        }
        else{
            st=mid+1;
        }
       }
       
    return ans;
}
}