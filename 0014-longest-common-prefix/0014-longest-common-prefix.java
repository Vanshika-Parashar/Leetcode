class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
       String s=strs[0];
       String b=strs[strs.length-1];
       StringBuilder sb=new StringBuilder();
       int min=Math.min(s.length(),b.length());
       for(int i=0;i<min;i++){
        if(s.charAt(i)!=b.charAt(i)){
            break;

        }
        sb.append(s.charAt(i));
       }
       return sb.toString();
        
    }
}