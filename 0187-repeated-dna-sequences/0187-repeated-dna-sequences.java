class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String>seen=new HashSet<>();
        HashSet<String>repeated=new HashSet<>();
        List<String>ans=new ArrayList<>();
        if(s.length()<=10){
            return ans;
        }
        int i=0;
        for(int j=10;j<=s.length();j++){
            String cur=s.substring(i,j);
            if(!seen.contains(cur)){
                seen.add(cur);
            }
            else{
                repeated.add(cur);
            }
            i++;
        }
        for(String r:repeated){
            ans.add(r);
        }
        return ans;
        

        
    }
}