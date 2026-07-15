class Solution {
    public String reverseWords(String s) {
        String []s1=s.trim().split(" ");
        StringBuffer ans=new StringBuffer();

        for(int i=s1.length-1;i>=0;i--){
            if(!s1[i].isEmpty()){
                ans.append(s1[i]);
                if(i>0){
                    ans.append(" ");
            }
                
            }
            
        }
        return ans.toString();

        
    }
}