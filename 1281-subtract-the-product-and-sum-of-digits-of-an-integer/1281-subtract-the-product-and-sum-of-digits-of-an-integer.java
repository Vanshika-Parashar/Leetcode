class Solution {
    public int subtractProductAndSum(int n) {
        int x=n;
        int mul=1;
        int last=0;
        while(x!=0){
            last=x%10;
            mul*=last;
            x=x/10;
        }
        int add=0;
        while(n!=0){
            last=n%10;
            add+=last;
            n=n/10;
        }
        return(mul-add);
        
    }
}