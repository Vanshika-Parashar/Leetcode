class Solution {
    public boolean isHappy(int n) {
         
         Set<Integer>s=new HashSet<>();
         return happy(n,s);
         
         
    }
    public boolean happy(int n,Set<Integer>s){
        if(n==1){
            return true;
        }
        String s1=String.valueOf(n);
        if(s.contains(n)){
            return false;
        }
        int sum=0;
        for(int i=0;i<s1.length();i++){
            int sq=(s1.charAt(i)-'0')*(s1.charAt(i)-'0');
            sum+=sq;
        }
        s.add(n);
        return happy(sum,s);
    }
    
    
}