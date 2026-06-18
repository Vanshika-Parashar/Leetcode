class Solution {
    public int hammingWeight(int n) {
        String s=Integer.toBinaryString(n);
        int count=0;
        for(int i=0;i<s.length();i++){
            int p=s.charAt(i)-'0';
            if(p==1){
                count++;
            }
        }
        return count;
        
    }
}