class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
    //     int max=Integer.MIN_VALUE;
    //     int min=Integer.MAX_VALUE;
    //     for(int i:nums){
    //         if(i>max){
    //             max=i;
    //         }
    //     }
    //     int ans=-1;
    //     int st=1;
    //     int end=max;
    //     while(st<=end){
    //         int mid=st+(end-st)/2;
    //         int n=divide(nums,mid);
    //         if(n<=threshold){
    //             ans=mid;
    //             end=mid-1;
    //         }
    //         else{
    //             st=mid+1;
    //         }
    //     }
    //     return ans;
        
    // }
    // public static int divide(int []arr,int mid){
    //     int sum=0;
    //     for(int i:arr){
    //         sum+=(i+mid-1)/mid;//for getting ans in ceil without using ceil function
    //     }
    //     return sum;
    
    int min=1;
    int max=Integer.MIN_VALUE;
    for(int i:nums){
        if(i>max){
            max=i;
        }
    }
        int st=min;
        int end=max;
        int ans=-1;
    while(st<=end){
        int mid=st+(end-st)/2;
        int sum=divide(nums,mid);
        if(sum<=threshold){
            ans=mid;
            end=mid-1;
        }
        else{
            st=mid+1;
        }
       
        }
        return ans;
    }
    public int divide(int[]nums,int divisor){
        int sum=0;
        for(int i:nums){
            sum+=(i+divisor-1)/divisor;
        }
        return sum;
    }
    
}
