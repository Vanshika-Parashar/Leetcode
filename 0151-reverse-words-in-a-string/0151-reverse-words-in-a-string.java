class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] sh=s.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=sh.length-1;i>=0;i--){
            sb.append(sh[i]);
            if(i>0){
                sb.append(" ");
            }
        }
        return sb.toString();
        
    }
}