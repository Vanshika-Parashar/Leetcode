// class Solution {
//     public boolean isHappy(int n) {
         
//          Set<Integer>s=new HashSet<>();
//          return happy(n,s);
         
         
//     }
//     public boolean happy(int n,Set<Integer>s){
//         if(n==1){
//             return true;
//         }
//         String s1=String.valueOf(n);
//         if(s.contains(n)){
//             return false;
//         }
//         int sum=0;
//         for(int i=0;i<s1.length();i++){
//             int sq=(s1.charAt(i)-'0')*(s1.charAt(i)-'0');
//             sum+=sq;
//         }
//         s.add(n);
//         return happy(sum,s);
//     }
    
    
// }
class Solution {
    public boolean isHappy(int n) {
         Set<Integer>n1=new HashSet<>();
        return happy(n,n1);
        
    
    
    }
    public static Boolean happy(int n,Set<Integer>n1){
        if(n==1){
            return true;
        }
       
        String s=Integer.toString(n);
        char[]ch=s.toCharArray();
        if(n1.contains(n)){
            return false;
        }
        int sum=0;
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            sum+=Character.getNumericValue(c)*Character.getNumericValue(c);
        }
        n1.add(n);
        return happy(sum,n1);
        
    }
    
    
}