class Solution {
    public boolean isHappy(int n) {
         
         Set<Integer>s=new HashSet<>();
         s.add(n);
         int sum=find(n);
         
         while(sum>1){
            if(s.contains(sum)){
                return false;
            }
            else{
                s.add(sum);
                sum=find(sum);
            }
            
         }
         if(sum==1){
            return true;
         }
         return false;
        
    }
    public int find(int n){
        int sum=0;
        int p=0;
        while(n!=0){
            p=n%10;
            int sq=p*p;
            sum+=sq;
            n=n/10;
        }
        return sum;
    }
    
    
}