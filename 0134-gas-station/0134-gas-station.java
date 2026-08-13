class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int totalgas=0;
       int totalcost=0;
       for(int i=0;i<gas.length;i++){
        totalgas+=gas[i];
        totalcost+=cost[i];
       }
       if(totalgas<totalcost)return -1;
       int target=0;
       int result=0;
       for(int i=0;i<gas.length;i++){
        target+=gas[i]-cost[i];
        if(target<0){
            result=i+1;
            target=0;
        }
       }
        return result;
    }
}