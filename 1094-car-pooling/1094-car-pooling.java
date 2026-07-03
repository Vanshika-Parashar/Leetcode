class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n=trips.length;
        int m=trips[0].length;
        int count=0;
        int[]diff=new int[1001];
        for(int[]trip:trips){
            int passenger=trip[0];
            int from=trip[1];
            int to=trip[2];
            diff[from]+=passenger;
            diff[to]-=passenger;


        }
        
        for(int i=0;i<diff.length;i++){
            count+=diff[i];
            if(count>capacity)return false;
        }
        
        
        return true;
    }
}