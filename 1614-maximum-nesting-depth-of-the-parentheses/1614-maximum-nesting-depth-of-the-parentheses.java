class Solution {
    public int maxDepth(String s) {
        int l=s.length();
        int depth=0;
        int max=0;
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch=='('){
                depth++;
                max=Math.max(max,depth);
            }
            else if(ch==')'){
                depth--;
            }
            
        }
        return max;
    }
}