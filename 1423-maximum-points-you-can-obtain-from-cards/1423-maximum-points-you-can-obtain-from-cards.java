class Solution {
    public int maxScore(int[] arr, int k) {
        int sum=0;
        int i=0;
       
        for( i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=sum;
        int j=arr.length-1;
        i=k-1;
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