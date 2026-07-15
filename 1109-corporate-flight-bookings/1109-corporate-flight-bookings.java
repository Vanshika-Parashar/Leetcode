class Solution {
    public int[] corpFlightBookings(int[][] arr, int n) {
        int []ans=new int[n];
        for(int i=0;i<arr.length;i++){
            int first=arr[i][0];
            int last=arr[i][1];
            int seat=arr[i][2];
            ans[first-1]+=seat;
            if(last<n)ans[last]-=seat;
        }
        int[]prefix=new int[n];
        prefix[0]=ans[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+ans[i];
        }
        return prefix;
    }
}