class Solution {
    public int minFlips(String target) {
        int count=0;
        int cur='0';
        for(int i=0;i<target.length();i++){
            if(target.charAt(i)!=cur){
                count++;
                cur=target.charAt(i);
            }
        }
        return count;
    }
}