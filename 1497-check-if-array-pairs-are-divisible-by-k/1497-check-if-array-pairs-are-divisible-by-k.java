class Solution {
    public boolean canArrange(int[] nums, int k){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            int ele=i%k;
            if(ele<0)ele=ele+=k;
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        if(map.containsKey(0)){
            int val=map.get(0);
            if(val%2!=0)return false;
        }
        map.remove(0);
        for(int i:map.keySet()){
            int rem=k-i;
            if(!map.containsKey(rem))return false;
            else{
                int rf=map.get(rem);
                int fi=map.get(i);
                if(rf!=fi)return false;
            }
        }
        return true;

    }
}
                