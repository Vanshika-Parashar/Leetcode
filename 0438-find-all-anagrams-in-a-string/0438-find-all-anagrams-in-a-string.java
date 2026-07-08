class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        if(s.length()<p.length()){
            return ans;
        }
        int[] pcount=new int[26];
        int[] scount=new int[26];
        for(int i=0;i<p.length();i++){
            pcount[p.charAt(i)-'a']++;
            scount[s.charAt(i)-'a']++;

        }
        if(Arrays.equals(pcount,scount)){
            ans.add(0);
        }
        int i=0;
        for(int j=p.length();j<s.length();j++){
            scount[s.charAt(i)-'a']--;
            i++;
            scount[s.charAt(j)-'a']++;
            if(Arrays.equals(scount,pcount)){
                ans.add(i);
            }
        }
        return ans;
    }
}