class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
        Arrays.sort(s);
        Arrays.sort(g);
        int i=0,j=0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                i++;
                j++;count++;
            }else if(s[j]<g[i])j++;
        }
        return count;
    }
}
