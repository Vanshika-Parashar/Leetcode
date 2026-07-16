class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        HashSet<Integer>setq=new HashSet<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
            setq.add(i);
        }
        HashSet<Integer>set=new HashSet<>();
        for(int i:setq){
            int val=map.get(i);
            if(set.contains(val)){
                return false;
            }
            else{
                set.add(val);
            }
        }
        return true;
        
        
    }
}