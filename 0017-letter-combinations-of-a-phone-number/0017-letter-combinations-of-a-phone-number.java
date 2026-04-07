class Solution {
    public List<String> letterCombinations(String ques) {
        List<String>ans=new ArrayList<>();
        String[]codes={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        if(ques.length()==0){
            return ans;
        }
        return letter(ques,codes,ans,"");
    }
    public List<String> letter(String ques,String[]codes,List<String> ans,String s){
         if(ques.length()==0){
                ans.add(s);
                return ans;
        }
        char ch=ques.charAt(0);
        String press=codes[ch-48];
        for(int i=0;i<press.length();i++){
            letter(ques.substring(1),codes,ans,s+press.charAt(i));
        }
        return ans;
    }
}