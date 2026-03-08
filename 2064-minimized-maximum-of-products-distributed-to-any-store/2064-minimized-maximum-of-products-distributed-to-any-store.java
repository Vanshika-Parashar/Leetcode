class Solution {
    public boolean ispossible(int max,int n,int[]arr){
        int stores=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%max==0){
                stores+=arr[i]/max;
            }
            else{
                stores+=arr[i]/max+1;
            }
        }
        if(stores>n){
            return false;
        }
        else{
            return true;
        }
    }
    public int minimizedMaximum(int n, int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
        }
        int lo=1;
        int hi=max;
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(ispossible(mid,n,arr)){
                ans=mid;
                hi=mid-1;
                
            }
            else{
                lo=mid+1;
            }
        }
        return ans;
        
    }
}