class Solution {
    public int lengthOfLongestSubstring(String s) {
        boolean []check=new boolean[128];
        int i=0;
        int n=s.length();
        int max=0;
        int j=0;
        while(j<n){
            if(check[s.charAt(j)]==false){
                check[s.charAt(j)]=true;
                max=Math.max(max,j-i+1);
                j++;
            }
            
            else{
                check[s.charAt(i)]=false;
                i++;
            }
                
            }
            return max;
        }
        
    }

       
  