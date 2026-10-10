class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int[]prev=intervals[0];
        int lap=0;
        for(int i=1;i<intervals.length;i++){
            int[]cur=intervals[i];
            if(cur[0]<prev[1]){
                lap++;
                prev[1]=Math.min(prev[1],cur[1]);

            }else{
                prev=cur;
            }
        }
        return lap;
    }
}