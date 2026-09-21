class Solution {
    public int shipWithinDays(int[] w, int d) {
    int st=Integer.MIN_VALUE;
    int end=0;
    for(int i:w){
        end+=i;
        st=Math.max(i,st);
    }
    int ans=0;
    while(st<=end){
        int mid=st+(end-st)/2;
        int days=find(w,mid);
        if(days<=d){
            ans=mid;
            end=mid-1;
        }else{
            st=mid+1;
        }
    }
    return ans;
    }
    public int find(int[]w,int mid){
        int days=1;
        int count=0;
        for(int i:w){
            if(count+i>mid){
                days++;
                count=i;
            }else{
                count+=i;
            }
        }
        return days;
    }
}