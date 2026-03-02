class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer>ans=new ArrayList<>();
        int n=arr.length;
        if(x<arr[0]){
            for(int i=0;i<k;i++){
                ans.add(arr[i]);
            }
            return ans;
        }
        
        else if(x>arr[n-1]){
            for(int i=n-1;i>=n-k;i--){
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }
        //find upper bound
        int lo=0;int hi=n-1;
        int lb=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=x){
                lb=mid;
                hi=mid-1;
            }
            else{
                lo=mid+1;
            }
        }
        int i=lb-1;
        int j=lb;
        while(k>0 && i>=0 && j<n){
            int di=Math.abs(x-arr[i]);
            int dj=Math.abs(x-arr[j]);
            if(di<=dj){
                ans.add(arr[i]);
                i--;
                k--;

            }
            else{
                ans.add(arr[j]);
                j++;
                k--;
            }
        }
        if(i<0 && k>0){
            while(k>0){
                ans.add(arr[j]);
                j++;
                k--;
            }
        }
        if(j>n-1 && k>0){
            while(k>0){
                ans.add(arr[i]);
                i--;
                k--;
            }
        }
        Collections.sort(ans);
        return ans;
        
    }
}