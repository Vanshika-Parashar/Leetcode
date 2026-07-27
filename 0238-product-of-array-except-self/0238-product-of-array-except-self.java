class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[]prefix=new int[n];
        prefix[0]=1;
        int[]sufix=new int[n];
        sufix[n-1]=1;
        for(int i=1;i<n;i++){
            prefix[i]=nums[i-1]*prefix[i-1];
        }
        for(int i=n-2;i>=0;i--){
            sufix[i]=sufix[i+1]*nums[i+1];
        }
        for(int i=0;i<n;i++){
            sufix[i]=sufix[i]*prefix[i];
        }
        return sufix;

    }
}