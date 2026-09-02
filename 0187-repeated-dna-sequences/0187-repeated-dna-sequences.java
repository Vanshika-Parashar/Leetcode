class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String>contain=new HashSet<>();
       
        Set<String>ans=new HashSet<>();
        
        for(int j=0;j<=s.length()-10;j++){
            String st=s.substring(j,j+10);
            if(contain.contains(st)){
                ans.add(st);
                
            }
           
            contain.add(st);
        }
        List<String>a=new ArrayList<>();
        for(String st:ans){
            a.add(st);
        }
        return a;
       
    }
}