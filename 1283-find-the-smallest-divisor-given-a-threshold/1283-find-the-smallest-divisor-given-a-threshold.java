class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
    int st=1;
    int max=Integer.MIN_VALUE;
    for(int i:nums){
        max=Math.max(max,i);
    }
    int ans=0;
    int end=max;
    while(st<=end){
        int mid=st+(end-st)/2;
        int sum=find(mid,nums);
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
    public int find(int mid ,int[]arr){
        int sum=0;
        for(int i:arr){
            if(i%mid==0){
                sum+=i/mid;
            }
            else{
                sum+=i/mid+1;
            }
        }
        return sum;
    }
    }
    

