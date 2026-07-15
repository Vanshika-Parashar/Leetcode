class Solution {
    public int lengthOfLongestSubstring(String s) {
        int []freq=new int[128];
        int i=0;
        int max=Integer.MIN_VALUE;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            freq[ch]++;
            while(freq[ch]>1){
                freq[s.charAt(i)]--;
                i++;
            }
            max=Math.max(max,j-i+1);
        }
        if(max==Integer.MIN_VALUE)return 0;
        return max;
    }
        
}

       
  