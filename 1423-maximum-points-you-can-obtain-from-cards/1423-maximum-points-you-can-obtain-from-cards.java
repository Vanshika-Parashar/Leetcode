class Solution {
    public int maxScore(int[] arr, int k) {
        int sum=0;
        
       
        for(int j=0;j<k;j++){
            sum+=arr[j];
        }
        int i=k-1;
        int j=arr.length-1;
        int max=sum;
        while(i>=0){
            sum-=arr[i];
            sum+=arr[j];
            i--;
            j--;
            max=Math.max(sum,max);
        }
        return max;
    }
}