class Solution {
    public int characterReplacement(String s, int k) {
       int maxfreq=0;
       int i=0;
       Map<Character,Integer>map=new HashMap<>();
       int max=Integer.MIN_VALUE;
       for(int j=0;j<s.length();j++){
        if(map.containsKey(s.charAt(j))){
            map.put(s.charAt(j),map.get(s.charAt(j))+1);
        }else{
            map.put(s.charAt(j),1);
        }
        maxfreq=Math.max(map.get(s.charAt(j)),maxfreq);
        
        while((j-i+1)-maxfreq>k){
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
            i++;
        }
        max=Math.max(j-i+1,max);
       }
       return max;
    }
}