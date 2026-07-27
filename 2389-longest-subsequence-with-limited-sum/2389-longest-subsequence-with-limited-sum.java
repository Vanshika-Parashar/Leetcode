class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int n=nums.length;
        Arrays.sort(nums);
        int[]prefix=new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=nums[i]+prefix[i-1];
        }
        int m=queries.length;
        int[]ans=new int[m];
        for(int i=0;i<m;i++){
            ans[i]=find(prefix,queries[i]);
        }
        return ans;
    }
    public int find(int[]prefix,int ele){
        int st=0;
        int end=prefix.length-1;
        
        int max=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(prefix[mid]>ele){
                end=mid-1;
            }
            else{
                max=Math.max(mid,max);
                st=mid+1;
            }
        }
        return max+1;
    }
}