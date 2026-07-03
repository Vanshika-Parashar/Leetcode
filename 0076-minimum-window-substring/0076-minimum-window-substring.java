class Solution {
    public String minWindow(String s, String t) {
        int[]need=new int[256];
        int[]window=new int[256];
        int l=0;
        int r=0;
        int count=0;
        int minlen=Integer.MAX_VALUE;
        int st=0;
        for(char c:t.toCharArray()){
            need[c]++;
        }
        while(r<s.length()){
            char c=s.charAt(r);
            window[c]++;
            if(need[c]>0 && window[c] <= need[c]){
                count++;
            }
            while(count==t.length()){
                if(r-l+1<minlen){
                    minlen=r-l+1;
                    st=l;
                }
                char le=s.charAt(l);
                if (need[le] > 0 && window[le] <= need[le]) {
                    count--;
                }
                window[le]--;
                l++;
            }
            r++;
                }
                return minlen == Integer.MAX_VALUE ? "" : s.substring(st, st + minlen);
            }
        }
