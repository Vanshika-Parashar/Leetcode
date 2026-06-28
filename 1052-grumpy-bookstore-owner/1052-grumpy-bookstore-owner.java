class Solution {
    public int maxSatisfied(int[] customer, int[] grumpy, int minutes) {
        int max=0;
        int sum=0;
        int n=grumpy.length;
        for(int i=0;i<n;i++){
            if(grumpy[i]==0){
                sum+=customer[i];
            }
        }
        for(int j=0;j<minutes;j++){
            if(grumpy[j]==1){
                sum+=customer[j];
            }
        }
        max=Math.max(sum,max);
        int i=1;
        int j=minutes;
        while(j<n){
            if(grumpy[i-1]==1){
                sum-=customer[i-1];
                
            }
            if(grumpy[j]==1){
                sum+=customer[j];
                
            }
            max=Math.max(max,sum);
            i++;
            j++;
        }
        return max;
        

    }
}