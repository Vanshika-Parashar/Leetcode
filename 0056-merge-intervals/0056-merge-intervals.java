class Solution {
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->a[0]-b[0]);
       ArrayList<int[]>ans=new ArrayList<>();
       int[]prev=intervals[0];
       for(int i=1;i<intervals.length;i++){
        int[] current=intervals[i];
        if(current[0]<=prev[1]){
            prev[1]=Math.max(prev[1],current[1]);

        }
        else{
            ans.add(prev);
            prev=intervals[i];
        }
       }
       ans.add(prev);
       int[][]finalans=new int[ans.size()][2];
       for(int i=0;i<ans.size();i++){
            finalans[i]=ans.get(i);
       }
       return finalans;

              
    }
}