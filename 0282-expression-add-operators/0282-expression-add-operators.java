class Solution {
    public List<String> addOperators(String num, int target) {
        List<String>ans=new ArrayList<>();
        operatr(num,ans,"",target,0,0,0);
        return ans;
        
    }
    public List<String>operatr(String num,List<String>ans,String s,int t,long calc,long tail,int idx){
        if(idx==num.length()){
            if(calc==t){
                ans.add(s);
                return ans;
            }
        }
        for(int i=idx;i<num.length();i++){
            if(i>idx && num.charAt(idx)=='0'){
                break;
            }
            String n=num.substring(idx,i+1);
            long curr = Long.parseLong(n);
            if(idx==0){
                operatr(num,ans,s + n,t,curr,curr,i+1);

            }
            else{
                operatr(num,ans,s + "+" + n,t,calc+curr,curr,i+1);
                operatr(num,ans,s + "-" + n,t,calc-curr,-curr,i+1);
                operatr(num,ans,s + "*" + n,t,calc-tail+tail*curr,tail*curr,i+1);
            }
        }
        return ans;

    }
}