class Solution {
    public void rotate(int[] nums, int k) {
        if(k>nums.length){
            k=k%nums.length;
        }
    //APPROACH 1 46%
    //    int []a=new int [k];
    //    int m=nums.length-k;
    //    int r=0;
    //    for(int i=0;i<k;i++){
    //     a[i]=nums[m+i];
        
    //    }
    //    int s=nums.length-1;
    //    for(int i=nums.length-1;i>=k;i--){
    //     nums[i]=nums[i-k];
       
    //    }
    //    for(int i=0;i<k;i++){
    //     nums[i]=a[i];
    //    }
    //APPROACH 2 25%
    // int rotate[]=new int[k];
    // int index=0;
    // int n=nums.length;
    // for(int i=n-k;i<n;i++){
    //     rotate[index]=nums[i];
    //     index++;
    // }
    // int[]left=new int[n-k];
    // for(int i=0;i<n-k;i++){
    //     left[i]=nums[i];
    // }
    // for(int i=0;i<rotate.length;i++){
    //     nums[i]=rotate[i];
    // }
    // int p=k;
    // for(int i=0;i<left.length;i++){
    //     nums[p]=left[i];
    //     p++;
    // }
    //APPROACH 3 100%
    
      int n=nums.length;
    //   k=k%n;
      reverse(nums,0,n-1)        ;
      reverse(nums,0,k-1);
      reverse(nums,k,n-1);
    }
     void reverse(int [] nums, int start , int end ){
          int temp ;
        while(start < end ){
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp ;
            start++ ;
            end--;
        }
    

        
    }
}