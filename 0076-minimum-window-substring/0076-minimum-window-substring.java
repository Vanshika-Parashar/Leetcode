class Solution {
    public String minWindow(String s, String t) {
    HashMap<Character,Integer>map=new HashMap<>();
    int i=0;
    for(i=0;i<t.length();i++){
        char ch=t.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    i=0;
    int min=Integer.MAX_VALUE;
    int st=-1;
    int required=t.length();
    for(int j=0;j<s.length();j++){
        char ch=s.charAt(j);
        if(map.containsKey(ch)){
           if(map.get(ch)>0){
            required--;
           }
            map.put(ch,map.get(ch)-1);
            
        }
        while(required==0){
            if(j-i+1<min){
                min=j-i+1;
                st=i;
            }
            char c=s.charAt(i);
            if(map.containsKey(c)){
                int freq=map.get(c);
                map.put(c,freq+1);
                if(map.get(c)>0)required++;
            }
            i++;

        }
        
        
    }
    if(min==Integer.MAX_VALUE)return "";
    return (s.substring(st,st+min));
    }
}
