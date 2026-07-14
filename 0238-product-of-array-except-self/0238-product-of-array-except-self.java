class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        int[] prefixpro=new int[n];
        int []suffixpro=new int[n];
        prefixpro[0]=1;
        suffixpro[n-1]=1;
        for(int i=1;i<n;i++){
            prefixpro[i]=prefixpro[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suffixpro[i]=suffixpro[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            ans[i]=prefixpro[i]*suffixpro[i];
        }
        return ans;
        
        
    }
}