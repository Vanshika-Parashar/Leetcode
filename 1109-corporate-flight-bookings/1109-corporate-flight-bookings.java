class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[]pre=new int[n];
        for(int i=0;i<bookings.length;i++){
            int st=bookings[i][0];
            int last=bookings[i][1];
            int seat=bookings[i][2];
            pre[st-1]=pre[st-1]+seat;
            if(last<n)pre[last]=pre[last]-seat;

        }
        int []ans=new int[pre.length];
        ans[0]=pre[0];
        for(int i=1;i<pre.length;i++){
            ans[i]=pre[i]+ans[i-1];
        }
        return ans;
        
    }
}