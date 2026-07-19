class Solution {
    public int bestClosingTime(String s) {

        int n=s.length();
        int[]sufixy=new int[n+1];
        int []prefixn=new int[n+1];
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)=='Y'){
                sufixy[i]=sufixy[i+1]+1;
            }else{
                sufixy[i]=sufixy[i+1]+0;
            }
        }
        for(int i=1;i<=n;i++){
            if(s.charAt(i-1)=='N'){
                prefixn[i]=prefixn[i-1]+1;
            }else{
                prefixn[i]=prefixn[i-1]+0;
            }
        }
        int min=n+5;
        int[]ans=new int[prefixn.length];
        for(int i=0;i<prefixn. length;i++){
            ans[i]=prefixn[i]+sufixy[i];
            min=Math.min(min,ans[i]);
        }
        for(int i=0;i<ans.length;i++){
            if(min==ans[i])return i;
        }
        return 0;
    }
}