class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[]=new int[26];
        for(int i=0;i<text.length();i++){
            char ch=text.charAt(i);
            freq[ch-'a']++;
        }
        int count=0;
        while(ischeck(freq)){
            count++;
           
        }
        return count;
        
    }
    public boolean ischeck(int[]freq){
        String s="balloon";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(freq[ch-'a']==0){
                return false;
            }
            else{
                freq[ch-'a']--;
            }
        }
        return true;
    }
}