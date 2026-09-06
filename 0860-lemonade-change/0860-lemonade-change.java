class Solution {
    public boolean lemonadeChange(int[] bills) {
      int tcount=0;
      int fcount=0;
      for(int i=0;i<bills.length;i++){
        if(bills[i]==5){
            fcount++;
        }
        else if(bills[i]==10){
            if(fcount<1)return false;
            else{
                tcount++;
                fcount--;
            }
        }
        else{
            if(tcount>=1 && fcount>=1){
                tcount--;
                fcount--;
            }else if(fcount>=3){
                fcount-=3;
            }else{
                return false;
            }
        }
      }
      return true;
    }
}