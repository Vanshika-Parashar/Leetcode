class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->a[1]-b[1]);
       int[]prev=intervals[0];
       int count=0;
       for(int i=1;i<intervals.length;i++){
        int[]curr=intervals[i];
        if(curr[0]<prev[1]){
            prev[1]=Math.min(curr[1],prev[1]);
            count++;
        }else{
            
            prev=curr;
        }
       }
       return count;
    }
}