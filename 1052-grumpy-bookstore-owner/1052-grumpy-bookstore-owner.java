class Solution {
    public int maxSatisfied(int[] customer, int[] grumpy, int minutes) {
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<customer.length;i++){
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
        for(int j=minutes;j<grumpy.length;j++){
            if(grumpy[i-1]==1){
                sum-=customer[i-1];
                
            }
            if(grumpy[j]==1){
                sum+=customer[j];
            }
            i++;
            
            max=Math.max(sum,max);
           
            

        }
        return max;
    }
}