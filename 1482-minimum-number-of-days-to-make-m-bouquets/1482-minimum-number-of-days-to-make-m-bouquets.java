class Solution {
    public int minDays(int[] arr, int m, int k) {
        if(m*k>arr.length)return -1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            min=Math.min(i,min);
            max=Math.max(i,max);
        }
        int st=min;
        int end=max;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            int noofbouquets=find(arr,mid,k);
            if(noofbouquets>=m){
                ans=mid;
                end=mid-1;
            }
            else{
                st=mid+1;
            }
        }
        return ans;
       
    }
    public int find(int[]arr,int mid,int k){
        int count=0;
        int noofbouquets=0;
        for(int i:arr){
            if(i<=mid){
                count++;
            }
            else{
                noofbouquets+=count/k;
                count=0;
            }
        }
        noofbouquets+=count/k;
        return noofbouquets;
    }
}