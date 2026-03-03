class Solution {
    public int shipWithinDays(int[] w, int d) {
    //     int max=Integer.MIN_VALUE;
    //     int sum=0;
    //     for(int i:w){
    //         sum+=i;
    //         if(i>max){
    //             max=i;
    //         }
    //     }
    //     int ans=0;
    //     int st=max;
    //     int end=sum;
    //     while(st<=end){
    //         int mid=st+(end-st)/2;
    //         int n=f(w,mid);
    //         if(n<=days){
    //             ans=mid;
    //             end=mid-1;
    //         }
    //         else{
    //             st=mid+1;
    //         }
    //     }
    //     return ans;
        
    // }
    // public static int f(int[]w,int mid){
    //     int day=1;
    //     int count=0;
    //     for(int i:w){
    //         if(count+i>mid){
    //             day++;
    //             count=i;
    //         }
    //         else{
    //             count+=i;
    //         }
    //     }
    //     return day;
    int st=Integer.MIN_VALUE;
    int end=0;
    for(int i:w){
        end+=i;
        if(i>st){
            st=i;
        }

    }
    int ans=0;

    while(st<=end){
        int mid=st+(end-st)/2;
        int days=find(w,mid);
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
    public int find(int[]w,int mid){
        int days=1;
        int count=0;
        for(int i:w){
            if(count+i>mid){
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