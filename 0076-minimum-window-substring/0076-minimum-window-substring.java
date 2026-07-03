class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char i:t.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int i=0;
        int min=Integer.MAX_VALUE;
        int st=-1;
        int count=0;
        for(int j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                if(map.get(s.charAt(j))>0){
                    count++;
                }
                
                map.put(s.charAt(j),map.get(s.charAt(j))-1);
            }
            while(count==t.length()){
                if(j-i+1<min){
                    min=j-i+1;
                    st=i;
                }
                char ch=s.charAt(i);
                if(map.containsKey(ch)){
                    map.put(ch,map.get(ch)+1);
                    if(map.get(ch)>0){
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
