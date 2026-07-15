class Solution {
    public int maxDepth(String s) {
        int brackets=0;
        int max=0;
        for(char i:s.toCharArray()){
            if(i=='('){
                brackets++;
            }
            else if(i==')'){
                brackets--;
            }
            max=Math.max(max,brackets);
        }
        return max;
    }
}