class Solution {
    public int[] corpFlightBookings(int[][] arr, int n) {
       int[]prefix=new int[n];
       for(int i=0;i<arr.length;i++){
        int[]book=arr[i];
        int first=book[0];
        int last=book[1];
        int seat=book[2];
        prefix[first-1]+=seat;
        if(last<n)prefix[last]-=seat;
       }
       int[]ans=new int[prefix.length];
       ans[0]=prefix[0];
       for(int i=1;i<prefix.length;i++){
            ans[i]=ans[i-1]+prefix[i];
       }
       return ans;
    }
}