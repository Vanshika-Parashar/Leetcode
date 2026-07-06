class Solution {
    public String trimTrailingVowels(String s) {
        StringBuilder sb=new StringBuilder();
        int j=s.length()-1;
        int i=s.length();
        while(j>=0 && isvowel(s.charAt(j))){
            j--;
            i--;
        }
        if(j==-1){
            return "";
        }
        return s.substring(0,i);
        
    }
    public boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}