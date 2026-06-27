class Solution {
    public int lengthOfLongestSubstring(String s) {
       boolean []freq=new boolean[128];
        
        int maxlen=0;
        int i=0;
        int n=s.length();
        int len=0;
        int j=0;
        while(j<n){
            
            while(j<n && freq[s.charAt(j)]==false){
                freq[s.charAt(j)]=true;
                maxlen=Math.max(maxlen,j-i+1);
                j++;
            }
            if(j==n)break;
            while(i<n && freq[s.charAt(j)]==true){
                freq[s.charAt(i)]=false;
                i++;
            }
        }
        return maxlen;
        }
        
    }

       
  