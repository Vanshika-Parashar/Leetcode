class Solution {
    public int maxSatisfied(int[] c, int[] g, int minutes) {
        int sum=0;
        for(int j=0;j<g.length;j++){
            if(g[j]==0){
                sum+=c[j];
            }
        }
        int i=0;
        for(int j=0;j<minutes;j++){
            if(g[j]==1){
                sum+=c[j];
            }
        }
        int max=sum;
        for(int j=minutes;j<g.length;j++){
            if(g[i]==1){
                sum-=c[i];
                
            }
            i++;
            if(g[j]==1){
                sum+=c[j];
            }
            max=Math.max(sum,max);
        }
        return max;
    }
}