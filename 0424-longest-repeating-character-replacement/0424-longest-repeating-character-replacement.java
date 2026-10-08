class Solution {
    public int characterReplacement(String s, int k) {
        int maxfreq=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int max=Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            maxfreq=Math.max(map.get(ch),maxfreq);
            while((i-j+1)-maxfreq>k){
                char c=s.charAt(j);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)map.remove(map.get(c));
                j++;
            }
            max=Math.max(i-j+1,max);
        }
        return max;
    }
}