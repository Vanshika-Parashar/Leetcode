class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i),i);
        }
        
        for(int i=1;i<words.length;i++){
            String s1=words[i-1];
            String s2=words[i];
            int j=0;
            for(j=0;j<Math.min(s1.length(),s2.length());j++){
                if(s1.charAt(j)==s2.charAt(j))continue;
                if(map.get(s1.charAt(j))>map.get(s2.charAt(j))){
                    return false;
                     
                }
                break;
            }
                if(j==Math.min(s1.length(),s2.length()) && s1.length()>s2.length()){
                    return false;
                }
            }
        
        return true;
    }
}