class Solution {
    public int minSubArrayLen(int target, int[] arr) {
        int i=0;
        int j=0;
        int sum=0;
        int n= arr.length;
        int minlen=Integer.MAX_VALUE;
        while(j<n && sum<target){
            sum+=arr[j];
            j++;
        }
        j--;
        int len=0;
        while(i<n && j<n){
            len=j-i+1;
            if(sum>=target)minlen=Math.min(minlen,len);
            sum-=arr[i];
            i++;
            j++;
            while(j<n && sum<target){
                sum+=arr[j];
                j++;
            }
            j--;
        }
        if(minlen==Integer.MAX_VALUE)return 0;
        return minlen;
    }
}