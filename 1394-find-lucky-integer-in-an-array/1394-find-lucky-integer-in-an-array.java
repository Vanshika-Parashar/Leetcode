class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer>a=new ArrayList<>();
        for(int i:arr){
            if(map.get(i)==i){
                a.add(i);
            }
        }
        if(a.size()==0)return -1;
       return Collections.max(a);
        
        
    }
}