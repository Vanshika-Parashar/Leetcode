class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder();
        String a=strs[0];
        String b=strs[strs.length-1];
        int min=Math.min(a.length(),b.length());
        for(int i=0;i<min;i++){
            if(a.charAt(i)!=b.charAt(i)){
                break;
            }else{
                sb.append(a.charAt(i));
            }
        }
        return sb.toString();
    }
}