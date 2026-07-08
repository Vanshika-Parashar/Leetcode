class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int i=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        int start=-1;
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){
                    count++;
                    
                    
                }
                map.put(ch,map.get(ch)-1);
            }
            while(count==t.length()){
               if(j-i+1<min){
                start=i;
                min=j-i+1;
               }
            
        
                char c=s.charAt(i);
                if(map.containsKey(c)){
                    
                
                map.put(c,map.get(c)+1);
                if(map.get(c)>0){
                    count--;
                }
                }
                i++;
            }
        }
        if(min==Integer.MAX_VALUE)return "";
        return s.substring(start,start+min);

    }
}
