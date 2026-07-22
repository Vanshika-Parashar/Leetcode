class Solution {
    public int findMinArrowShots(int[][] points) {
       ArrayList<int[]> list=new ArrayList<>();
       for(int []arr:points){
        list.add(arr);
       }
       Collections.sort(list,(a,b)->Integer.compare(a[0],b[0]));
       int count=1;
       int[]prev=list.get(0);
       for(int i=1;i<list.size();i++){
        int[]curr=list.get(i);
        if(prev[1]>=curr[0]){
            // prev[0]=Math.max(curr[0],prev[0]);
            prev[1]=Math.min(curr[1],prev[1]);
        }
        else{
            count++;
            prev=curr;
        }
       }
       return count;
    }
}