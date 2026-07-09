class Solution {
    public int characterReplacement(String s, int k) {
       int maxfreq=0;
       HashMap<Character,Integer>map=new HashMap<>();
       int i=0;
       int max=0;
       for(int j=0;j<s.length();j++){
        char ch=s.charAt(j);
        map.put(ch,map.getOrDefault(ch,0)+1);
        maxfreq=Math.max(maxfreq,map.get(ch));
        while((j-i+1)-maxfreq >k){
            char c=s.charAt(i);
            map.put(c,map.get(c)-1);
            
            i++;
        }
        max=Math.max(max,j-i+1);
       }
       return max;

    }
}