class Solution {
    public int maxScore(int[] arr, int k) {
        int ans=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            ans+=arr[i];
        }
        int f=ans;
        int max=ans;
        

       for(int i=0;i<k;i++){
        f-=arr[k-1-i];
        
        f+=arr[n-1-i];
        max=Math.max(max,f);
       }
       return max;
        
    }
}