class Solution {
    public boolean validDigit(int n, int x) {
        String s=String.valueOf(n);
        if(s.charAt(0)-'0'!=x){
            int count=0;
            while(n!=0){
                int p=n%10;
                if(p==x)return true;
                n=n/10;
            }
        }
        return false;
        
    }
}