class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        
        int[]pre=new int[nums.length];
        pre[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        int[]ans=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            ans[i]=find(pre,queries[i]);
        }
        
        return ans;
        
    }
    public int find(int[]pre,int query){
        int st=0;
        int end=pre.length-1;
        int ans=0;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(pre[mid]<=query){
                ans=mid+1;
                st=mid+1;
            }else{
                end=mid-1;
            }
        }
        return ans;

    }

}