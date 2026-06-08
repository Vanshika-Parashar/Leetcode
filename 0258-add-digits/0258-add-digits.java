class Solution {
    
//     public int addDigits(int num) {
//         int s=sum(num);
//         return s;
    
// }
// public static int sum(int n){
//     String s=Integer.toString(n);
//     char[]ch=s.toCharArray();
//     if(ch.length==1){
//         return n;
//     }
//     int su=0;
//     for(int i=0;i<ch.length;i++){
//         char c=ch[i];
//         su+=Character.getNumericValue(c);
//     }
//     return sum(su);
    public int addDigits(int num){
        int s=sum(num);
        return s;

    } 
    public static int sum(int n){
        String s=Integer.toString(n);
        char[]ch=s.toCharArray();
        if(ch.length==1){
            return n;
        }
        int su=0;
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            su+=Character.getNumericValue(c);

        }
        return sum(su);
    }
}

