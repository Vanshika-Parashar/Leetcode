class Solution {
    public int lengthOfLastWord(String s) {
        //1st approach
        // String[]arr=s.split(" ");
        // int s1=arr.length;
        // int n=arr[s1-1].length();
        // return n;
        //2nd approach
        int n=s.length()-1;
        int c=0;
       
        while(n>=0 && s.charAt(n)==' '){
            c++;
            n--;
            
        }

            
            
            
        
        return c;
        // String[]s1=s.split(" ");
        // int n=s1.length-1;
        // String l=s1[n];
        // int l1=l.length();
        // return l1;
        // String []s1=s.split(" ");
        // int n=s1.length-1;
        // String s2=s1[n];
        // int l1=s2.length();
        // return l1;
        // String[]ch=s.split(" ");
        // int n=ch.length-1;
        // int p=ch[n].length();
        // return p;


       

       
    }
}