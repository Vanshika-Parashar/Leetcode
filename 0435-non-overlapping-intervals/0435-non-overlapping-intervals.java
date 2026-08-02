class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int count=0;
        int[]prev=intervals[0];
        for(int i=1;i<intervals.length;i++){
            int[]curr=intervals[i];
            if(prev[1]>curr[0]){
                count++;
                prev[1]=Math.min(curr[1],prev[1]);
            }else{
               prev= curr;
            }
        }
        return count;
    }
}