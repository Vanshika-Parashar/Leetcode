class Solution {
    public int countPalindromicSubsequence(String s) {
       HashMap<Character,Integer>fmap=new HashMap<>();
       HashMap<Character,Integer>lmap=new HashMap<>();
       for(int i=0;i<s.length();i++){
        if(!fmap.containsKey(s.charAt(i))){
            fmap.put(s.charAt(i),i);
        }
        lmap.put(s.charAt(i),i);
       }
       int count=0;
       for(char ch:fmap.keySet()){
        int st=fmap.get(ch);
        int end=lmap.get(ch);
        if(st!=end){
            Set<Character>set=new HashSet<>();
            for(int i=st+1;i<end;i++){
                set.add(s.charAt(i));
            }
            count+=set.size();
        }
        
        
       }
        return count;
    }
}