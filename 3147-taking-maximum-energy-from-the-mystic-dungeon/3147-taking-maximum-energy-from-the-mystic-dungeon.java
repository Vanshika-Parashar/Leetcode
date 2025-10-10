class Solution {
    public int maximumEnergy(int[] arr, int k) {
        int ans=0;
        int i=0;
        while(i<arr.length && i+k<arr.length ){
            ans+=arr[i]+arr[i+k];
            // if(ans<arr[i]){
            //     ans=arr[i];

            // }
            if(ans<arr[i+k]){
                ans=arr[i+k];
            }
            i++;
        }
        return ans;
        
    }
}