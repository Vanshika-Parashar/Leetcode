class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[]freq=new int[128];
        if(s.length()==0)return 0;
        int max=Integer.MIN_VALUE;
        int i=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            int ele=ch-'0';
            freq[ch]++;
            while(freq[ch]>1){
                char c=s.charAt(i);
                freq[c]--;
                i++;
            }
            max=Math.max(j-i+1,max);
        }
        return max;
    }
        
}

       
  