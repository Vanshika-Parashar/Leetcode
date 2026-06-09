class Solution {
    public int numberOfSteps(int num) {
        int res=find(num,0);
        return res;
        
    }
    public int find(int n,int count){
        if (n==0){
            return count;
        }
        if(n%2==0){
            return find(n/2,count+1);
        }
        else{
            return find(n-1,count+1);
        }
        
        
    }
}