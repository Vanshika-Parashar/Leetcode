class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        char[]prr=new char[p.length()];
        char []srr=new char[p.length()];
        if(s.length()<p.length())return new ArrayList<>();
        for(int i=0;i<p.length();i++){
            prr[i]=p.charAt(i);
            srr[i]=s.charAt(i);
        }
        Arrays.sort(prr);
        Arrays.sort(srr);
        int i=0;
        List<Integer>ans=new ArrayList<>();
        if(Arrays.equals(srr,prr))ans.add(0);
        for(int j=p.length();j<s.length();j++){
            i++;
            String st=s.substring(i,j+1);
            char []ch=st.toCharArray();
            Arrays.sort(ch);
            if(Arrays.equals(prr,ch))ans.add(i);
            
        }
        return ans;
    }
}