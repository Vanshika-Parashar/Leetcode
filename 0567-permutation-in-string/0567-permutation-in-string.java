class Solution {
    public boolean checkInclusion(String s1, String s2) {
       if(s2.length()<s1.length())return false;
       int[]freq1=new int[26];
       int[]freq2=new int[26];
       for(int i=0;i<s1.length();i++){
            char ch=s1.charAt(i);
            char c=s2.charAt(i);
            freq1[ch-'a']++;
            freq2[c-'a']++;
       }
       int i=0;
       if(Arrays.equals(freq1,freq2))return true;
       for(int j=s1.length();j<s2.length();j++){
        freq2[s2.charAt(i)-'a']--;
        i++;
        freq2[s2.charAt(j)-'a']++;
        if(Arrays.equals(freq1,freq2))return true;
       }
       return false;

    }
}