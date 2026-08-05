class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int []freq1=new int[26];
        int[]freq2=new int[26];
        if(s2.length()<s1.length())return false;
        for(int i=0;i<s1.length();i++){
            char c=s2.charAt(i);
            char d=s1.charAt(i);
            freq2[c-'a']++;
            freq1[d-'a']++;
        }
        int i=0;
        if(Arrays.equals(freq1,freq2))return true;
        for(int j=s1.length();j<s2.length();j++){
            freq2[s2.charAt(i)-'a']--;
            i++;
            freq2[s2.charAt(j)-'a']++;
            if(Arrays.equals(freq2,freq1))return true;
        }
        return false;
    }
}