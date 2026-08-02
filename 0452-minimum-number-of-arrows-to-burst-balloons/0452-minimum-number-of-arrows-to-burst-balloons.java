class Solution {
    public int findMinArrowShots(int[][] points) {
       Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
       int[] prev=points[0];
       int  ballons=0;
       for(int i=1;i<points.length;i++){
        int[]curr=points[i];
        if(curr[0]<=prev[1]){
            prev[1]=Math.min(prev[1],curr[1]);
        }
        else{
            ballons++;

            prev=curr;

        }
       }
       return ballons+1;
    }
}