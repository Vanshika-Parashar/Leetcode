class Solution {
    public String convert(String s, int k) {
        if(k==1){
            return s;
        }
        
        StringBuilder[] rows=new StringBuilder[k];
        for(int i=0;i<k;i++){
            rows[i]=new StringBuilder();
        }
        int currrow=0;
        boolean grow=false;
        for(char c:s.toCharArray()){
            rows[currrow].append(c);
            if(currrow==0||currrow==k-1){
                grow=!grow;
            }
            currrow += grow ? 1 : -1;

        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder r:rows){
            ans.append(r);
        }
        return (ans.toString());
        
    }
}