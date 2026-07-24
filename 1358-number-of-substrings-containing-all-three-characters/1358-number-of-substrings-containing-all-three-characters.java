class Solution {
    public int numberOfSubstrings(String s) {
       int j=0;
       int i=0;
       int total=0;
       int count=0;
       int n=s.length();
       Map<Character,Integer>map=new HashMap<>();
       while(j<n){
        char ch=s.charAt(j);
        map.put(ch,map.getOrDefault(ch,0)+1);
        while(map.size()==3 && i<n){
            count=n-j;
            total+=count;
            char c=s.charAt(i);
            map.put(c,map.get(c)-1);
            if(map.get(c)==0)map.remove(c);
            i++;
        }
        
        j++;
       }
       return total;
       
       
        
    }
}