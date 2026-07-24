class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int i=0;
        int count=0;
        int sum=0;
        int n=arr.length;
        for(int j=0;j<k;j++){
            sum+=arr[j];
        }
        if(sum/k>=t)count++;
        for(int j=k;j<n;j++){
            sum+=arr[j];
            while(j-i+1>k){
                sum-=arr[i];
                if(sum/k>=t)count++;
                i++;
            }
        }
        return count;
    }
}