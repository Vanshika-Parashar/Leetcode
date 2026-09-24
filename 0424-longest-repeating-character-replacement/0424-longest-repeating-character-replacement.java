class Solution {
    public int characterReplacement(String s, int k) {
      HashMap<Character,Integer>map=new HashMap<>();
      int i=0;
      int maxfreq=0;
      int max=Integer.MIN_VALUE;
      for(int j=0;j<s.length();j++){
        char ch=s.charAt(j);
        map.put(s.charAt(j),map.getOrDefault(ch,0)+1);
         maxfreq=Math.max(maxfreq,map.get(ch));
        while((j-i+1)-maxfreq>k){
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
            if(map.get(s.charAt(i))==0)map.remove(s.charAt(i));
            i++;
        }
        max=Math.max(max,j-i+1);
      }
      return max;
    }
}