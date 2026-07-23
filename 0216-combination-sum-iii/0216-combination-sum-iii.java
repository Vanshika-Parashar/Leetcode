class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        return find(ans,l,k,n,1);


    }
    public List<List<Integer>> find(List<List<Integer>>ans,List<Integer>l,int k,int n,int idx){
        if(n==0){
            if(l.size()==k){
                ans.add(new ArrayList<>(l));

            }
            return ans;
        }
        for(int i=idx;i<=9;i++){
            if(n-i>=0){
                l.add(i);
                n-=i;
                find(ans,l,k,n,i+1);
                n+=i;
                l.remove(l.size()-1);
            }
        }
        return ans;
    }
}