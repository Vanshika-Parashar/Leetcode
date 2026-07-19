class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
        Arrays.sort(nums);
        int prefix[]=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            ans[i]=find(queries[i],prefix);
        }
        return ans;
        
    }
    public int find(int query,int[]prefix){
        int st=0;
        int end=prefix.length-1;;
        int ans=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(prefix[mid]<=query){
                ans=Math.max(mid,ans);
                st=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans+1;
    }
}