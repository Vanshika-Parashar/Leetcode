class Solution {
    public int maxSatisfied(int[] c, int[] g, int minutes) {
        int sum=0;
        for(int i=0;i<g.length;i++){
            if(g[i]==0){
                sum+=c[i];
            }
        }
        for(int i=0;i<minutes;i++){
            if(g[i]==1){
                sum+=c[i];
            }
        }
        int max=sum;
        int i=0;
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