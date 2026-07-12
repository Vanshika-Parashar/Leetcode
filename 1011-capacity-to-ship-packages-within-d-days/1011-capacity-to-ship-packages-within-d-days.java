class Solution {
    public int shipWithinDays(int[] w, int d) {
    int sum=0;
    int max=Integer.MIN_VALUE;
    for(int i:w){
        max=Math.max(i,max);
        sum+=i;
    }
    int ans=0;
    int st=max;
    int end=sum;
    while(st<=end){
        int mid=st+(end-st)/2;
        int days=find(mid,w);
        if(days<=d){
            ans=mid;
            end=mid-1;
        }
        else{
            st=mid+1;
        }

    }
    return ans;
    }
    public int find(int capacity,int[]arr){
        int count=0;
        int days=1;
        for(int i:arr){
            if(count+i>capacity){
                days++;
                count=i;
            }
            else{
                count+=i;
            }
        }
        return days;
    }
}