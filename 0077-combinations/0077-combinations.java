class Solution {
    public List<List<Integer>> combine(int n, int k) {
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        return find(arr,0,k,ans,l);
    }
    public List<List<Integer>> find(int[]arr,int idx,int k,List<List<Integer>>ans,List<Integer>l){
        if(k==0){
            ans.add(new ArrayList<>(l));
            return ans;
        }
        for(int i=idx;i<arr.length;i++){
            l.add(arr[i]);
            find(arr,i+1,k-1,ans,l);
            l.remove(l.size()-1);
        }
        return ans;
    }
}