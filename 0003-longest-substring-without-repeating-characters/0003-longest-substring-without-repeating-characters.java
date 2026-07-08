class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[]freq=new int[128];
        int i=0;
        int max=0;
        for(int j=0;j<s.length();j++){
            freq[s.charAt(j)]++;
            while(freq[s.charAt(j)]>1){
                freq[s.charAt(i)]--;
                i++;
            }
            max=Math.max(j-i+1,max);
        }
        return max;
       
    }
        
}

       
  