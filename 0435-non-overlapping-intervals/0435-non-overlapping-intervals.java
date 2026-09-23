class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       int count=0;
       int []prev=intervals[0];
       for(int i=0;i<intervals.length;i++){
        int[]cur=intervals[i];
        if(cur[0]<prev[1]){
            count++;
            prev[1]=Math.min(cur[1],prev[1]);
        }else{
            prev=cur;
            
        }

       }
       return count-1;
    }
}