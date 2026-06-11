class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        return find(ans,l,k,n,1);


    }
    public List<List<Integer>> find(List<List<Integer>>ans,List<Integer>l,int k,int n,int idx){
        if(k==0 && n==0){
            ans.add(new ArrayList(l));
        }
        for(int i=idx;i<=9;i++){
            if(k!=0 && n-i>=0){
                l.add(i);
                find(ans,l,k-1,n-i,i+1);
                l.remove(l.size()-1);
            }
        }
        return ans;
    }
}