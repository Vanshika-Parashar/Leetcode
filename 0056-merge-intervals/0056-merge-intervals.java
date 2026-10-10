class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int[]prev=intervals[0];
        ArrayList<int[]>list=new ArrayList<>();
        for(int i=1;i<intervals.length;i++){
            int[]cur=intervals[i];
            if(prev[1]>=cur[0]){
                prev[1]=Math.max(prev[1],cur[1]);
            }else{
                list.add(prev);
                prev=cur;
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