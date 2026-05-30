class Solution {
    public int shipWithinDays(int[] w, int d) {
    int max=Integer.MIN_VALUE;
    int sum=0;
    for(int i:w){
        sum+=i;
        max=Math.max(max,i);
    }
    int st=max;
    int end=sum;
    while(st<=end){
        int mid=st+(end-st)/2;
        int days=find(w,mid);
        if(days<=d){
            end=mid-1;
        }
        else{
            st=mid+1;
        }
    }
    return st; 

    }
    public int find(int[]w,int mid){
        int count=0;
        int days=1;
        for(int i:w){
            if(count+i<=mid){
                count+=i;
            }
            else{
                days++;
                count=i;
            }
        }
        return days;
    }
}