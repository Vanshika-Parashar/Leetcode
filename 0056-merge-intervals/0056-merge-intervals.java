class Solution {
    public int[][] merge(int[][] intervals) {
      Arrays.sort(intervals,(a,b)->a[0]-b[0]);
      int[]prev=intervals[0];
      List<int[]>ans=new ArrayList<>();
      for(int i=1;i<intervals.length;i++){
        int[]cur=intervals[i];
        if(prev[1]>=cur[0]){
            
            prev[1]=Math.max(cur[1],prev[1]);
            
        }
        
        else{
            ans.add(prev);
            prev=cur;
        }
      }
      ans.add(prev);
      int[][]anss=new int[ans.size()][2];
      for(int i=0;i<ans.size();i++){
        anss[i]=ans.get(i);
      }
      return anss;

    }
}