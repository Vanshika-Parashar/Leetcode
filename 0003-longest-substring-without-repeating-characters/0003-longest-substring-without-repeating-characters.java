class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        // int left = 0;
        // int maxLength = 0;
        // HashSet<Character> charSet = new HashSet<>();

        // for (int right = 0; right < s.length(); right++) {
        //     while (charSet.contains(s.charAt(right))) {
        //         charSet.remove(s.charAt(left));
        //         left++;
        //     }

        //     charSet.add(s.charAt(right));
        //     maxLength = Math.max(maxLength, right - left + 1);
        // }

        // return maxLength;     
        int ans=0;
       for(int i=0;i<s.length();i++){
        Set<Character>st=new HashSet<>();
        int count=0;
        for(int j=i;j<s.length();j++){
            if(st.contains(s.charAt(j))){
                break;
            }
            else{
                st.add(s.charAt(j));
                count++;
            }
            }
            ans=Math.max(ans,count);
        } 
        return ans; 
    }
}
       
  