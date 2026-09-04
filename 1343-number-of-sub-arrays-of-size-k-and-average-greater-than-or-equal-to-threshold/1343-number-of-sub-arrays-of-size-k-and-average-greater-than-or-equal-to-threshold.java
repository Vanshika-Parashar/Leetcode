class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int i=0;
        int sum=0;
        int count=0;
        for(int j=0;j<k;j++){
            sum+=arr[j];
        }
        int avg=sum/k;
        if(avg>=t)count++;
        for(int j=k;j<arr.length;j++){
            sum-=arr[i];
            i++;
            sum+=arr[j];
            avg=sum/k;
            if(avg>=t)count++;
        }
        return count;
    }
}