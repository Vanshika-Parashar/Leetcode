class Solution {
    public boolean canArrange(int[] arr, int k) {
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int rem=arr[i]%k;
           if(rem<0)rem+=k;
           mp.put(rem,mp.getOrDefault(rem,0)+1);
        }
        if(mp.containsKey(0)){
            if(mp.get(0)%2!=0)return false;
            mp.remove(0);
        }
        for(int i:mp.keySet()){
            int rem=k-i;
            if(!mp.containsKey(rem))return false;
            int rfreq=mp.get(rem);
            int kfreq=mp.get(i);
            if(rfreq!=kfreq)return false;
        }
        return true;
    }
}  