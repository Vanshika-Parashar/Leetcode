class Solution {
    public boolean lemonadeChange(int[] bills) {
       int tc=0;
       int fc=0;
       for(int bill:bills){
        if(bill==5){
            fc++;
        }
        else if(bill==10){
            if(fc==0)return false;
            fc--;
            tc++;
        }
        else if(bill==20){
            if(fc>0 && tc>0){
                fc--;
                tc--;
            }
            else if(fc>=3){
                fc-=3;
            }else{
                return false;
            }
        }
       }
       return true;
    }
}