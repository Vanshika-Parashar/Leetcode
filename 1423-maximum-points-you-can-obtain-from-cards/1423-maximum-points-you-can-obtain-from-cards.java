class Solution {
    public int maxScore(int[] arr, int k) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int ans=sum;
        int left=k-1;
        int right=n-1;
        while(left>=0){
            sum-=arr[left];
            sum+=arr[right];
            ans=Math.max(ans,sum);
            left--;
            right--;
        }
        return ans;

    }
}