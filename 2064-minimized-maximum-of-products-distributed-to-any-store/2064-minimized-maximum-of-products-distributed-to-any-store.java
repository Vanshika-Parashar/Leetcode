class Solution {
    public int   minimizedMaximum(int n,int[]arr){
        int st=1;
        int end=Integer.MIN_VALUE;
        for(int i:arr){
            end=Math.max(i,end);
        }
        int ans=0;
        while(st<=end){
            int mid=st+(end-st)/2;
            int stores=find(arr,mid);
            if(stores<=n){
                ans=mid;
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return ans;
        
    }
    public int find(int[]arr, int mid){
        int stores=0;
        for(int i:arr){
            if(i%mid==0){
                stores+=i/mid;
            }else{
                stores+=i/mid+1;
            }
        }
        return stores;
    }
}