class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
       HashSet<String>contain=new HashSet<>();
       HashSet<String>repeated=new HashSet<>();

       List<String>ans=new ArrayList<>();
       if(s.length()<10)return ans;
       contain.add(s.substring(0,10));
       int i=0;
       for(int j=10;j<s.length();j++){
            while(j-i+1>10){
                i++;
            }
            String s1=s.substring(i,j+1);
            if(contain.contains(s1)){
                repeated.add(s1);
            }else{
                contain.add(s1);
            }
       }
       for(String r:repeated){
        ans.add(r);
       }
       return ans;

        
    }
}