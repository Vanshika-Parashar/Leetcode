class Solution {
    public int numberOfSubstrings(String s) {
       int count=0;
       int i=0;
       int n=s.length();
       HashMap<Character,Integer>map=new HashMap<>();
       for(int j=0;j<s.length();j++){
        map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
        while(map.size()==3){
            count+=n-j;
            char ch=s.charAt(i);
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)==0)map.remove(ch);
            i++;
        }
       }
       return count;
       
       
        
    }
}