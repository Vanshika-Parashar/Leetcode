class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        int i=0;
        int count=0;
        int n =s.length();
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.size()==3){
                char c=s.charAt(i);
                count+=n-j;
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)map.remove(c);
                i++;
            }
        }
        return count;
        
    }
}