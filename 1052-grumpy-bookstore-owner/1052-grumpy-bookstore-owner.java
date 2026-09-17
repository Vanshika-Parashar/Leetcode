class Solution {
    public int maxSatisfied(int[] customer, int[] grumpy, int minutes) {
        int sum=0;
        for(int i=0;i<grumpy.length;i++){
            if(grumpy[i]==0){
                sum+=customer[i];
            }
        }
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                sum+=customer[i];
            }
        }
        int max=sum;
        int i=0;
        for(int j=minutes;j<grumpy.length;j++){
            if(grumpy[i]==1){
                sum-=customer[i];
            }
            i++;
            if(grumpy[j]==1){
                sum+=customer[j];
            }
            max=Math.max(max,sum);
        }
        return max;
    }
}