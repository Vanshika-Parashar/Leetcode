class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int thresh=nums.length/3;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);

        }
        List<Integer>list=new ArrayList<>();
        for(int i:map.keySet()){
            int val=map.get(i);
            if(val>thresh){
                list.add(i);
            }
        }
        return list;

    }
}