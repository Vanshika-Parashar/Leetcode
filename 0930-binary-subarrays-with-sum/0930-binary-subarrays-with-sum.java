class Solution {

    public int numSubarraysWithSum(int[] nums, int k) {
        if(k<=0){
            int ans=0;
            int len=0;
            for(int i:nums){
                if(i==0){
                    len++;
                }
                else{
                    ans+=len*(len+1)/2;
                    len=0;
                }
            }
            ans+=len*(len+1)/2;
            return ans;

        }
        int a=0,i=0,j=0,k2=0,b=0,n=nums.length;
        while(i<n && nums[i]!=1){
            i++;
        }
        while(j<n && k2<k){
            if(nums[j]==1){
                k2++;
            }
            j++;
        }
        j--;
        if(k2<k)return 0;
        b=j+1;
        while(b<n && nums[b]!=1){
            b++;
        }
        b--;
        int sum=0;
        while(b<n){
            sum+=(i-a+1)*(b-j+1);
            a=i+1;
            i++;
            while(i<n && nums[i]!=1){
                i++;
            }
            j=b+1;
            b=j+1;
            while(b<n && nums[b]==0){
                b++;
            }
            b--;
           
        }
        return sum;


       
    }

    

    }
