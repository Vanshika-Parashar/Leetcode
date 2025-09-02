class Solution {
    public boolean isHappy(int n) {
    //      Set<Integer>n1=new HashSet<>();
    //     return happy(n,n1);
        HashSet<Integer>n1=new HashSet<>();
        return happy(n,n1);
    }
    public static Boolean happy(int n,Set<Integer>n1){
        if(n==1){
            return true;
        }
        if(n1.contains(n)){
            return false;
        }
        String s=Integer.toString(n);
        char[]ch=s.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            sum+=Character.getNumericValue(c)*Character.getNumericValue(c);
        }
        n1.add(n);
        return happy(sum,n1);

    
    
    // }
    // public static Boolean happy(int n,Set<Integer>n1){
    //     if(n==1){
    //         return true;
    //     }
       
    //     String s=Integer.toString(n);
    //     char[]ch=s.toCharArray();
    //     if(n1.contains(n)){
    //         return false;
    //     }
    //     int sum=0;
    //     for(int i=0;i<ch.length;i++){
    //         char c=ch[i];
    //         sum+=Character.getNumericValue(c)*Character.getNumericValue(c);
    //     }
    //     n1.add(n);
    //     return happy(sum,n1);
        
    }
    
    
}