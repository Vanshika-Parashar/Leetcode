class Solution {
    public double findMaxAverage(int[] arr, int k) {
        double sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];

        }
        double max=sum/k;
        int i=0;
        for(int j=k;j<arr.length;j++){
            sum-=arr[i];
            sum+=arr[j];
            i++;
            double avg=sum/k;
            max=Math.max(avg,max);
        }
        return max;
        
    }
}