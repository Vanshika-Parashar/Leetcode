class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String>contain=new HashSet<>();
       
        Set<String>ans=new HashSet<>();
        int i=0;
        for(int j=10;j<=s.length();j++){
            String st=s.substring(i,j);
            if(contain.contains(st)){
                ans.add(st);
            }else{
                contain.add(st);
            }
            i++;
        }
        List<String>anss=new ArrayList<>();
        for(String st:ans){
            anss.add(st);
        }
        return anss;
    }
}