class Solution {
    public boolean ispossible(int max,int n,int[]arr){
        int stores=0;
        for(int i=0;i<arr.length;i++){
            stores+=arr[i]/max;
            if(arr[i]%max!=0){
               stores+=1;
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
        int lo=1;
        int hi=100000;
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