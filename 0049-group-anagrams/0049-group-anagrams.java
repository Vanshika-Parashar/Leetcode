class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(String i:strs){
            
            char[] ch=i.toCharArray();
            Arrays.sort(ch);
            String st=new String(ch);
            if(!map.containsKey(st)){
                map.put(st,new ArrayList<>());
            }
            map.get(st).add(i);
        }
        return new ArrayList<>(map.values());
        
    }
}