class Solution {
    public long sumAndMultiply(int n) {
      String s=String.valueOf(n);
      long sum=0;
      int x=0;

      for(char ch:s.toCharArray()){
        int p=ch-'0';
        if(p>0){
            x=x*10+p;
            sum+=p;
        }
      }
      return x*sum;
        
    }
}