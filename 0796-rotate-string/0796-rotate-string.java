class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        String s1=s;
        if(s.length()!=goal.length())return false;
        for(int i=0;i<n;i++){
            s1=rotate(s1);
            if(s1.equals(goal))return true;
        }
        
        return false;
    }
    public String rotate(String s){
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(n-1));
        for(int i=0;i<n-1;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}