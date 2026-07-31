class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       int[] prev=intervals[0];
       ArrayList<int[]>list=new ArrayList<>();
       for(int i=1;i<intervals.length;i++){
        int []curr=intervals[i];
        if(curr[0]<=prev[1]){
            prev[1]=Math.max(curr[1],prev[1]);
            
        }
        else{
            list.add(prev);
            prev=curr;
        }
       }
       list.add(prev);
       int[][]ans=new int[list.size()][2];
       for(int i=0;i<list.size();i++){
        ans[i]=list.get(i);
       }
       return ans;
    }
}