class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
       int ballons=1;
       int []prev=points[0];
       for(int i=1;i<points.length;i++){
        int[]curr=points[i];
        if(curr[0]<=prev[1]){
            prev[1]=Math.min(curr[1],prev[1]);
        }
        else{
            ballons++;
            prev=curr;
        }
       }
       return ballons;
    }
}