class Solution {
    public int characterReplacement(String s, int k) {
       int i=0,j=0,maxfreq=0,ans=0,n=s.length();
       HashMap<Character,Integer>map=new HashMap<>();
       while(j<n){
        char ch=s.charAt(j);
        map.put(ch,map.getOrDefault(ch,0)+1);
        maxfreq=Math.max(maxfreq,map.get(ch));
        while((j-i+1)-maxfreq>k){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)-1);
            i++;
        }
        ans=Math.max(ans,(j-i+1));
        j++;
       }
       return ans;
    }
}