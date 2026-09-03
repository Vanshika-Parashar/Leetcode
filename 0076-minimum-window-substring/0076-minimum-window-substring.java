class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        int i=0;
        int min=Integer.MAX_VALUE;
        int st=-1;
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    count++;
                }
                map.put(ch,map.get(ch)-1);
                
            }
            
            while(count==t.length()){
                if(min>j-i+1){
                    min=j-i+1;
                    st=i;
                }
                char left=s.charAt(i);
                if(map.containsKey(left)){
                    map.put(left,map.get(left)+1);
                    if(map.get(left)>0){
                        count--;
                    }
                }
                i++;
                

            }
        }
        if(st==-1){
            return "";
        }
        return s.substring(st,st+min);
    
    }
}
