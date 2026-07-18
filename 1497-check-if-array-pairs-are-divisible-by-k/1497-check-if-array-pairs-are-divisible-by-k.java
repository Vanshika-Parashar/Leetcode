class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            int ele=i%k;
            if(ele<0)ele+=k;
            if(map.containsKey(ele)){
                map.put(ele,map.get(ele)+1);
            }else{
                map.put(ele,1);
            }
        }
        if(map.containsKey(0)){
            if(map.get(0)%2!=0)return false;
            map.remove(0);
        }
        for(int i:map.keySet()){
            int rem=k-i;
            if(!map.containsKey(rem))return false;
           int ifreq=map.get(i);
           int remfreq=map.get(rem);
           if(ifreq!=remfreq)return false;
        }
        return true;
    }
}  