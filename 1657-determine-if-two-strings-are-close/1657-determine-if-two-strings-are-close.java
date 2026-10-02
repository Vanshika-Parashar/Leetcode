class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())return false;
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
       for(int i=0;i<word1.length();i++){
        char c=word1.charAt(i);
        map1.put(c,map1.getOrDefault(c,0)+1);
       }
       for(int i=0;i<word2.length();i++){
        char c=word2.charAt(i);
        map2.put(c,map2.getOrDefault(c,0)+1);
       }
       if(!map1.keySet().equals(map2.keySet()))return false;
       List<Integer>l1=new ArrayList<>(map1.values());
       List<Integer>l2=new ArrayList<>(map2.values());
       Collections.sort(l1);
       Collections.sort(l2);
       return(l1.equals(l2));


    }
}