class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans=new ArrayList<>();
        return find(n,ans,"",0,0);
    }
    public List<String> find(int n,List<String>ans,String s,int oc,int cc){
        if(oc==n && cc==n){
            ans.add(s);
            return ans;
        }
        if(oc<n){
            find(n,ans,s+'(',oc+1,cc);
        }
        if(cc<n && cc<oc){
            find(n,ans,s+')',oc,cc+1);
        }
        return ans;
    }
}