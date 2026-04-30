class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        return find(arr,0,list,ans,t);
    }
    public List<List<Integer>> find(int[]arr,int idx,List<Integer>list,List<List<Integer>>ans,int t){
        if(t==0){
            ans.add(new ArrayList<>(list));
            return ans;
        }
        for(int i=idx;i<arr.length;i++){
            if(t-arr[i]>=0){
                list.add(arr[i]);
                find(arr,i,list,ans,t-arr[i]);
                list.remove(list.size()-1);

            }
            
            
        }
        return ans;
    }
}
