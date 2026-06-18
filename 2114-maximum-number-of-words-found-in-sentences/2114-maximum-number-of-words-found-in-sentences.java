class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        int len=0;
        for(int i=0;i<sentences.length;i++){
            String s=sentences[i];
            String[]ans=s.split(" ");
            max=Math.max(ans.length,max);
        }
        return max;
    }
}