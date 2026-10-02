class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        HashSet<Integer>s=new HashSet<>();
        for(int i:map.keySet()){
            int val=map.get(i);
            if(s.contains(val)){
                return false;
            }else{
                s.add(val);
            }
        }
        return true;
        
    }
}