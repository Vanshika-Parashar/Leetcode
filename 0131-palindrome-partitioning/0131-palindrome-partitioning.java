class Solution {
    public List<List<String>> partition(String s) {
       List<String>list=new ArrayList<>();
       List<List<String >>ans=new ArrayList<>();
       return palindrome(s,0,list,ans);
    }
    public List<List<String >> palindrome(String s,int idx,List<String>list,List<List<String >>ans){
        if(idx>=s.length()){
            ans.add(new ArrayList<>(list));
            return ans;
        }
        for(int i=idx;i<s.length();i++){
            String st=s.substring(idx,i+1);
            if(ispalindrome(st)){
                list.add(st);
                palindrome(s,i+1,list,ans);
                list.remove(list.size()-1);
            }
            
           
        }
         return ans;
    }
    public boolean ispalindrome(String st){
        int start=0;
        int end=st.length()-1;
        
        char[]ch=st.toCharArray();
        while(start<=end){
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        String s=new String(ch);
        return s.equals(st);

    }
}