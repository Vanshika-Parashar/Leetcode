class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        List<int[]>list=new ArrayList<>();
        for(int[]arr:intervals){
            list.add(arr);
        }
        Collections.sort(list,(a,b)->a[0]-b[0]);
        int[]prev=list.get(0);
        int count=0;
        for(int i=1;i<intervals.length;i++){
            int[]curr=list.get(i);
            if(prev[1]>curr[0]){
                count++;
                if(prev[1]>curr[1]){
                    prev[1]=curr[1];
                }
            }
            else{
                prev=curr;
            }
        }
        return count;
    }
}