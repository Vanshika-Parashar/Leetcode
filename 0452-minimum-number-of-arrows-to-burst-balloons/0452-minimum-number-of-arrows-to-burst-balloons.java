class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0],b[0]));
        int []prev=points[0];
        int arr=1;
        for(int i=1;i<points.length;i++){
            int[]cur=points[i];
            if(cur[0]<=prev[1]){
                prev[1]=Math.min(cur[1],prev[1]);
            }
            else{
                arr++;
                prev=cur;
            }

        }
        return arr;
        
    }
}