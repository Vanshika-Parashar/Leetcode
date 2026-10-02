class Solution {
    public int largestAltitude(int[] gain) {
        int[]pre=new int[gain.length+1];
        pre[0]=0;
        for(int i=0;i<gain.length;i++){
            pre[i+1]=pre[i]+gain[i];
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<pre.length;i++){
            max=Math.max(pre[i],max);
        }

        return max;
    }
}