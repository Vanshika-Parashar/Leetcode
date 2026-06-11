class Solution {
    public int titleToNumber(String c) {
        long ans=0;
        for(int i=0;i<c.length();i++){
            char ch=c.charAt(i);
            ans=ans*26+(ch-'A'+1);
        }
        return (int)ans;
    }
}