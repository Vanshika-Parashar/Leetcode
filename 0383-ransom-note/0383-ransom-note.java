class Solution {
    public boolean canConstruct(String r, String m) {
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        for(char ch:r.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        for(char ch:m.toCharArray()){
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        }
        for(char ch:map1.keySet()){
            int val=map1.get(ch);
            if(!map2.containsKey(ch)){
                return false;
            }else{
                if(map2.get(ch)<val){
                    return false;
                }
            }
        }
        return true;
    }
}