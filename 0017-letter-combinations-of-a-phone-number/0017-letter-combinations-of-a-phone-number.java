class Solution {
    public List<String> letterCombinations(String ques) {
        String[]codes={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        List<String>ans=new ArrayList<>();
        return find(ans,ques,codes,"");
    }
    public List<String> find(List<String> ans,String ques,String[]codes,String s){
        if(ques.length()==0){
            ans.add(s);
            return ans;
        }
        char ch=ques.charAt(0);
        String code=codes[ch-'0'];
        for(int i=0;i<code.length();i++){
            find(ans,ques.substring(1),codes,s+code.charAt(i));
        }
        return ans;
    }
}