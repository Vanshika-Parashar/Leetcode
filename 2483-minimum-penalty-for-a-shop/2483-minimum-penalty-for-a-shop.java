class Solution {
    public int bestClosingTime(String s) {
        int[]n=new int[s.length()+1];
        int[]y=new int[s.length()+1];
        for(int i=1;i<=s.length();i++){
            n[i]=n[i-1];
            if(s.charAt(i-1)=='N'){
                n[i]+=1;
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            y[i]=y[i+1];
            if(s.charAt(i)=='Y'){
                y[i]+=1;

            }
        }
        int min=Integer.MAX_VALUE;
        int[]penalty=new int[s.length()+1];
        for(int i=0;i<=s.length();i++){
            penalty[i]=n[i]+y[i];
            min=Math.min(min,penalty[i]);
        }
        
        for(int i=0;i<penalty.length;i++){
            if(min==penalty[i])return i;
        }
        return 0;
        
    }
}
