class Solution {
    public int digitFrequencyScore(int n) {
        int[]freq=new int[10];
        Set <Integer>s=new HashSet();
        
        while(n!=0){
            int p=n%10;
            s.add(p);
            freq[p]++;
            n=n/10;
        }
        int sum=0;
        
        
        for(int i:s){
            if(freq[i]>0){
                sum+=i*freq[i];
            }
        }
        return sum;
        
    }
}