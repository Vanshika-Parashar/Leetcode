class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i]=0;
            }
            else{
                nums[i]=1;
            }
        }
        int a=0,i=0,j=0,b=0,k2=0,n=nums.length;
        while(i<n && nums[i]==0)i++;
        
        while(j<n && k2<k){
            if(nums[j]==1){
                k2++;
            }
            j++;
        }
        if(k2<k)return 0;
        j--;
        b=j+1;
        while(b<n && nums[b]==0){
            b++;
        }
        b--;
        
        //sliding window
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