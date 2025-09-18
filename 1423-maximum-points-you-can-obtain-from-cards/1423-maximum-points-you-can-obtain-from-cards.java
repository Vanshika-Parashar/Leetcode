class Solution {
    public int maxScore(int[] arr, int k) {
        int ans=0;
        int n=arr.length;
        for(int i=0;i<k;i++){
            ans+=arr[i];
        }
        int f=ans;
        int max=ans;
        int c=k-1;

       for(int i=0;i<k;i++){
        f-=arr[c];
        c--;
        f+=arr[(n-i)-1];
        max=Math.max(max,f);
       }
       return max;
        
    }
}