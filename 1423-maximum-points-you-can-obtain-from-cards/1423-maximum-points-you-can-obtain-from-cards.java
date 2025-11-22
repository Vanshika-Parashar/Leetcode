class Solution {
    public int maxScore(int[] arr, int k) {
    int l=0;
    int r=0;
    int n=arr.length;
    int max=0;
    for(int i=0;i<k;i++){
        l+=arr[i];
    }
    max=l;
    int idx=n-1;
    for(int i=k-1;i>=0;i-- ){
        l-=arr[i];
        l+=arr[idx];
        idx--;
        max=Math.max(l,max);
    }
    return max;

    }
}