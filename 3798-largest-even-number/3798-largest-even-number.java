class Solution {
    public String largestEven(String s) {
        StringBuilder sb=new StringBuilder(s);
        int i=s.length()-1;
        int j=s.length();
        while(i>=0 && s.charAt(i)!='2'){
            j--;
            i--;

        }
        if(i==-1){
            return "";
        }
        return s.substring(0,j);
    }
}