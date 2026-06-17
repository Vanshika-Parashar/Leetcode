class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int count=0;
        int i=0;
        int j=k-1;
        int sum=0;
        for(int a=0;a<k;a++){
            sum+=arr[a];
        }
        i++;
        j++;
        if(sum/k>=t)count++;
        while(j<arr.length){
            sum=sum-arr[i-1]+arr[j];
            if(sum/k>=t)count++;
            i++;
            j++;
        }
        return count;

        
    }
}