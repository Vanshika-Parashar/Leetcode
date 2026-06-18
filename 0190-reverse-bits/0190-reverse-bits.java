class Solution {
    public int reverseBits(int n) {
        String binary=Integer.toBinaryString(n);
        while(binary.length()<32){
            binary="0"+binary;
        }
        StringBuilder sb=new StringBuilder(binary);
        String rev=sb.reverse().toString();
        int ans=(int)Long.parseLong(rev,2);
        return ans;
        
    }
}