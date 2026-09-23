class Solution {
    public int findMinArrowShots(int[][] points) {
        ArrayList<int[]>list=new ArrayList<>();
        for(int[] i:points){
            list.add(i);
        }
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int count=1;
        int prev[]=points[0];
        for(int i=1;i<points.length;i++){
            int[]cur=points[i];
            if(cur[0]<=prev[1]){
                prev[1]=Math.min(prev[1],cur[1]);
            }else{
                count++;
                prev=cur;
            }
        }
        return count;
       
    }
}