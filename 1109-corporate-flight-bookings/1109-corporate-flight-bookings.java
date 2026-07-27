class Solution {
    public int[] corpFlightBookings(int[][] arr, int n) {
        int m=arr.length;
        int[] pre=new int[n];
        for(int i=0;i<m;i++){
            int start=arr[i][0];
            int end=arr[i][1];
            int step=arr[i][2];
            pre[start-1]+=step;
            if(end<n)pre[end]-=step;
        }
        int[]ans=new int[n];
        ans[0]=pre[0];
        for(int i=1;i<n;i++){
            ans[i]=ans[i-1]+pre[i];
        }
        return ans;
    }
}