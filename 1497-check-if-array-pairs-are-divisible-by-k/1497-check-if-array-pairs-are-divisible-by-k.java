class Solution {
    public boolean canArrange(int[] nums, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int ele=nums[i];
            int rem=ele%k;
            if(rem<0)rem+=k;
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        if(map.containsKey(0)){
            if(map.get(0)%2!=0){
                return false;
            }
            else{
                map.remove(0);
            }
        }
        for(int i:map.keySet()){
            int rem=k-i;;
            if(!map.containsKey(rem))return false;
            int freq1=map.get(i);
            int freq2=map.get(rem);
            if(freq1!=freq2)return false;
        }
        return true;
        
    }
}