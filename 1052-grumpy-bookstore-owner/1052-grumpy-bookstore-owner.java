class Solution {
    public int maxSatisfied(int[] customer, int[] grumpy, int minutes) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0){
                sum+=customer[i];
            }
        }
        max=sum;
        int i=0;
        for(int j=0;j<minutes;j++){
            if(grumpy[j]==1){
                sum+=customer[j];
            }
        }
        
        max=Math.max(sum,max);
        for(int j=minutes;j<grumpy.length;j++){
            if(grumpy[j]==1){
                sum+=customer[j];
            }
            if(grumpy[i]==1){
                sum-=customer[i];
                
            }
            i++;
            max=Math.max(max,sum);
        }
        return max;
    }
}