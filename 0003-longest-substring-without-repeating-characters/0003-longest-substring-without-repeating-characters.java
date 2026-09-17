class Solution {
    public int lengthOfLongestSubstring(String s) {
       int[]freq=new int[128];
        int i=0;
        int max=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            while(freq[ch]>=1){
                char c=s.charAt(i);
                freq[c]--;
                i++;
            }
            freq[ch]++;
            max=Math.max(j-i+1,max);
        }
        
       return max;
    }
        
}

       
  