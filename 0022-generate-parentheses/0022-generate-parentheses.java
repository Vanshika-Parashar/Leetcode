class Solution {
    public List<String> generateParenthesis(int n) {
           List<String>ans=new ArrayList<>();
           return find(n,0,0,ans,"");
    }
    public List<String> find(int n,int oc,int cc,List<String>ans,String s){
        if(oc==n && cc==n){
            ans.add(s);
            return ans;
        }
        if(oc<n){
            find(n,oc+1,cc,ans,s+'(');
        }
        if(cc < n && cc<oc){
            find(n,oc,cc+1,ans,s+')');
        }
        return ans;
    }
        
}
