class Solution {
    public int maxVowels(String s, int k) {
        int count=0;
        for(int i=0;i<k;i++){
            char ch=s.charAt(i);
            if(isvowel(ch)){
                count++;
            }
        }
        int max=count;
        int i=0;
        for(int j=k;j<s.length();j++){
            char ch=s.charAt(i);
            char c=s.charAt(j);
            if(isvowel(ch)){
                count--;
            }
            i++;
            if(isvowel(c)){
                count++;
                max=Math.max(count,max);
            }
        }
        return max;
        }
        
        
    
    public boolean isvowel(char ch){
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
}