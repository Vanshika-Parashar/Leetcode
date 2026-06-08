class Solution {
    public boolean isHappy(int n) {
         Set<Integer>s=new HashSet<>();
         return find(n,s);
        
        
    }
    public boolean find(int n,Set<Integer>s){
        if(n==1){
            return true;
        }
        if(s.contains(n)){
            return false;
        }
        int sum=0;
        int x=n;
        int last=0;
        while(x!=0){
            last=x%10;
            sum+=last*last;
            x=x/10;

        }
        s.add(n);
        return find(sum,s);

    }
    
    
}