class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=Integer.MIN_VALUE;
        int i=0;
        int[]freq=new int[128];
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            freq[ch]++;
            while(freq[ch]>1){
                char c=s.charAt(i);
                freq[c]--;
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        if (max==Integer.MIN_VALUE)return 0;
        return max;
        
    }
}