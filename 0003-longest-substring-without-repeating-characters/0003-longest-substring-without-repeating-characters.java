class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[]freq=new int[128];
        int i=0;
        if(s.length()==0)return 0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<s.length();j++){
            freq[s.charAt(j)]++;
            while(freq[s.charAt(j)]>1){
                freq[s.charAt(i)]--;
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        return max;
    }
        
}

       
  