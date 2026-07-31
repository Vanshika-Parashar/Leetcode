class Solution {
    public int singleNumber(int[] nums) {
       Arrays.sort(nums);
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int i:nums){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       ArrayList<Map.Entry<Integer,Integer>>list=new ArrayList<>(map.entrySet());
       Collections.sort(list,(a,b)->a.getValue()-b.getValue());
       return list.get(0).getKey();
        
    }
}