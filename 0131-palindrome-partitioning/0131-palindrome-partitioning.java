class Solution {
    public List<List<String>> partition(String s) {
        List<String>l=new ArrayList<>();
        List<List<String>>ans=new ArrayList<>();
        return find(s,l,ans,0);
        
    }
    public List<List<String>>find(String s,List<String>l,List<List<String>>ans,int idx){
        if(idx == s.length()) {
            ans.add(new ArrayList<>(l));
            return ans;
        }
        for(int i=idx;i<s.length();i++){
            if(palindrome(s,idx,i)){
                l.add(s.substring(idx,i+1));
                find(s,l,ans,i+1);
                l.remove(l.size()-1);
            }
        }
        return ans;
    }
    public boolean palindrome(String s,int st,int end){
        int s1=st;
        int e=end;
        while(s1<e){
            if(s.charAt(s1)!=s.charAt(e))return false;
            s1++;
            e--;
        }
        return true;
    }
}