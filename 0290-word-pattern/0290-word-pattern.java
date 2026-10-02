class Solution {
    public boolean wordPattern(String p, String s) {
        char[]ch=p.toCharArray();
        String[]st=s.split(" ");
        HashMap<Character,String>map=new HashMap<>();
        HashSet<String>set=new HashSet<>();
        if(ch.length!=st.length)return false;
        for(int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i])){
                if(!map.get(ch[i]).equals(st[i])){
                    return false;
                }
            }else{
               if(set.contains(st[i])){
                return false;
               }
               map.put(ch[i],st[i]);
               set.add(st[i]);
            }
        }
        return true;
        
    }
}