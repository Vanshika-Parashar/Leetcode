class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int[]prefix=new int[nums.length];
        int[]ans=new int[queries.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        for(int i=0;i<queries.length;i++){
            ans[i]=find(prefix,queries[i]);
        }
        return ans;
    }
    public int find(int[]prefix,int query){
        int st=0;
        int end=prefix.length-1;
        int max=-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(prefix[mid]>query){
                end=mid-1;
            }
            else{
                max=Math.max(max,mid);
                st=mid+1;
            }
        }
        
        return max+1;
    }
}