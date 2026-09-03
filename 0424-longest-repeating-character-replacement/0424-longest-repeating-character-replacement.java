class Solution {
    public int characterReplacement(String s, int k) {
       int maxfreq=Integer.MIN_VALUE;
       int i=0;
       int ans=0;
       HashMap<Character,Integer>map=new HashMap<>();
       for(int j=0;j<s.length();j++){
        char ch=s.charAt(j);
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }
        else{
            map.put(ch,1);
        }
        maxfreq=Math.max(maxfreq,map.get(ch));
        
        while(((j-i+1)-maxfreq)>k){
            char c=s.charAt(i);
            map.put(c,map.get(c)-1);
            i++;
        }
        ans=Math.max(ans,j-i+1);

       }
       return ans;
    }
}