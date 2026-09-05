class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       int[]prev=intervals[0];
       ArrayList<int[]>arr=new ArrayList<>();
       for(int i=1;i<intervals.length;i++){
        int[]cur=intervals[i];
        if(cur[0]<=prev[1]){
            prev[1]=Math.max(cur[1],prev[1]);
        }
        else{
            arr.add(prev);
            prev=cur;
        }
       }
       arr.add(prev);
       int[][]ans=new int[arr.size()][2];
       for(int i=0;i<arr.size();i++){
        ans[i]=arr.get(i);
       }
       return ans;
    }
}