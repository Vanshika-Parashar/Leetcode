class Solution {
    public int characterReplacement(String s, int k) {
       int maxfreq=0;
       int i=0;
       int max=0;
       HashMap<Character,Integer>map=new HashMap<>();
       for(int j=0;j<s.length();j++){
        map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
        maxfreq=Math.max(maxfreq,map.get(s.charAt(j)));
        
        while((j-i+1)-maxfreq>k ){
            char ch=s.charAt(i);
            map.put(ch,map.get(ch)-1);
            i++;
        }
        max=Math.max(max,j-i+1);
       }
       return max;
    }
}