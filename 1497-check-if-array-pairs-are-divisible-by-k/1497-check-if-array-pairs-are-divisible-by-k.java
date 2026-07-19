class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
            int rem=i%k;
            if(rem<0)rem+=k;
            map.put(rem,map.getOrDefault(rem,0)+1);
        }
        if(map.containsKey(0)){
            if(map.get(0)%2!=0)return false;
            map.remove(0);
        }
        for(int i:map.keySet()){
            int rem=k-i;
            if(!map.containsKey(rem))return false;
            int keyfreq=map.get(i);
            int remfreq=map.get(rem);
            if(keyfreq!=remfreq)return false;
        }
        return true;
    }
}  