class Solution {
    public boolean lemonadeChange(int[] bills) {
       int tc=0;
       int fc=0;
       for(int i=0;i<bills.length;i++){
        if(bills[i]==5)fc++;
        else if(bills[i]==10){
            if(fc<1)return false;
            fc--;
            tc++;
        }
        else{
            if(tc<1 && fc<3)return false;
            else if(tc>=1 && fc<1)return false;
            else if(tc<1 && fc>=3){
                fc-=3;
            }
            else if(tc>=1 && fc>=1){
                fc--;
                tc--;
            }
        }
       }
       return true;
    }
}