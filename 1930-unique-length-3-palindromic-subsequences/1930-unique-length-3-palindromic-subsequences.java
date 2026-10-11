class Solution {
    public int countPalindromicSubsequence(String s) {
        HashMap<Character,Integer>st=new HashMap<>();
        HashMap<Character,Integer>end=new HashMap<>();
        char[]ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(!st.containsKey(ch[i])){
                st.put(ch[i],i);
            }
            end.put(ch[i],i);
        }
        int ans=0;
        for(char i:st.keySet()){
            int f=st.get(i);
            int l=end.get(i);
            if(f!=l){
                HashSet<Character>set=new HashSet<>();
                for(int j=f+1;j<l;j++){
                    set.add(ch[j]);
                }
                ans+=set.size();
            }
        }
        return ans;

    }
}