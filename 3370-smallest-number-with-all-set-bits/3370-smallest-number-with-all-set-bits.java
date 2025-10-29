class Solution {
    public int smallestNumber(int n) {
        int x=0;
        List<Integer>l=new ArrayList<>();
        for(int i=1;i<1000;i=i<<1){
            x+=i;
            l.add(x);
        }
        for(int i=n;i<1000;i++){
            if(l.contains(i)){
                return i;
            }
        }
        return 1023;

        
    }
}