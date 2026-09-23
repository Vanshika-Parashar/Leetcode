class Solution {
    public boolean lemonadeChange(int[] bills) {
      int fc=0;
      int tc=0;
      for(int i=0;i<bills.length;i++){
        if(bills[i]==5){
            fc++;
        }
        else if(bills[i]==10){
            if(fc>=1){
                fc--;
                tc++;
            }
            else{
                return false;
            }
        }
        else{
            if(fc>=1 && tc>=1){
                fc--;
                tc--;
            }
            else if(fc>=3 && tc==0){
                fc-=3;
            }
            else{
                return false;
            }
        }
      }
      return true;
    }
}