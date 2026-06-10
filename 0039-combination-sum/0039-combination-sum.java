class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        List<List<Integer>>ans =new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        return find(arr,t,0,ans,l);

        
    }
    public List<List<Integer>> find(int[]arr, int t,int idx,List<List<Integer>>ans,List<Integer>l){
        if(t==0){
            ans.add(new ArrayList<>(l));
            return ans;
        }
        for(int i=idx;i<arr.length;i++){
            if(t-arr[i]>=0){
                l.add(arr[i]);
                find(arr,t-arr[i],i,ans,l);
                l.remove(l.size()-1);
            }
        }
        return ans;
    }
}
