class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        List<int[]>ans=new ArrayList<>();
        int i=0;
        //left non overlap part
        while(i<n && intervals[i][1]<newInterval[0]){
            ans.add(intervals[i]);
            i++;
        }
        //overlap part
        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
            newInterval[1]=Math.max(newInterval[1],intervals[i][1]);
            i++;
        }
        ans.add(newInterval);
        //right non overlap part
        while(i<n){
            ans.add(intervals[i]);
            i++;
        }
        int[][]anss=new int[ans.size()][2];
        for(int j=0;j<ans.size();j++){
            anss[j]=ans.get(j);
        }
        return anss;
    }
}