class Solution {
    public int numberOfSubstrings(String s) {
       int i=0;
       int count=0;
       HashMap<Character,Integer>map=new HashMap<>();
       for(int j=0;j<s.length();j++){
        char ch=s.charAt(j);
        map.put(ch,map.getOrDefault(ch,0)+1);
        while(map.size()==3){
            
            char c=s.charAt(i);
            map.put(c,map.get(c)-1);
            if(map.get(c)==0){
                map.remove(c);
            }
            i++;
        }
        count+=i;
       }
       return count;
       
       
        
    }
}