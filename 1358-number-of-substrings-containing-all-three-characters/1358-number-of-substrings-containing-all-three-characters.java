class Solution {
    public int numberOfSubstrings(String s) {
       HashMap<Character,Integer>map=new HashMap<>();
       int i=0;
       int count=0;
       for(int j=0;j<s.length();j++){
        char ch=s.charAt(j);
        map.put(ch,map.getOrDefault(ch,0)+1);
        while(map.size()==3){
            count+=s.length()-j;
            char c=s.charAt(i);
            map.put(c,map.get(c)-1);
            if(map.get(c)==0){
                map.remove(c);
            }
            i++;
        }
       }
       return count;
    }
}