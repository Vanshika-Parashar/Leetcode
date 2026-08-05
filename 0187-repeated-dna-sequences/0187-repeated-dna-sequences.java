class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
       Set<String>req=new HashSet<>();
       Set<String>ans=new HashSet<>();
       if (s.length() < 10) {
            return new ArrayList<>();
        }
       int i=0;
       String st=s.substring(0,10);
       req.add(st);
       for(int j=10;j<s.length();j++){
        i++;
        st=s.substring(i,j+1);
        if(req.contains(st)){
            ans.add(st);
        }else{
            req.add(st);
        }
       }
       List<String>anss=new ArrayList<>();
       for(String stt:ans){
        anss.add(stt);
       }
       return anss;
    }
}