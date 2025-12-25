class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int idx=m+n-1;
        // int i=n-1;
        // int j=m-1;
        // while(i>=0&&j>=0){
        //     if(nums1[j]>nums2[i]){
        //         nums1[idx--]=nums1[j--];
                
        //     }
        //     else{
        //         nums1[idx--]=nums2[i--];
                
        //     }
           
        // }
        // while(i>=0){
        //     nums1[idx--]=nums2[i--];
        // }
        // int idx=m+n-1;
        // int i=m-1;
        // int j=n-1;
        // while(i>=0 && j>=0){
        //     if(nums1[i]>nums2[j]){
        //         nums1[idx--]=nums1[i--];
        //     }
        //     else{
        //         nums1[idx--]=nums2[j--];
        //     }
        // }
        // while(j>=0){
        //     nums1[idx--]=nums2[j--];
        // }
    //     int idx=m+n-1;
    //     int i=m-1;
    //     int j=n-1;
    //     while(i>=0 && j>=0){
    //         if(nums1[i]>nums2[j]){
    //             nums1[idx--]=nums1[i--];
    //         }
    //         else{
    //             nums1[idx--]=nums2[j--];
    //         }
    //     }
    //     while(j>=0){
    //         nums1[idx--]=nums2[j--];
    //     }
        
     int i=m-1;
     int j=n-1;
     int k=m+n-1;
     while(i>=0 && j>=0){
        if(nums1[i]>=nums2[j]){
            nums1[k]=nums1[i];
            k--;
            i--;
        }
        else{
            nums1[k]=nums2[j];
            k--;
            j--;


        }
    } 
    if(i<0){
        while(j>=0){
            nums1[k]=nums2[j];
            k--;
            j--;
        }
    }
    if(j<0){
        while(i>=0){
            nums1[k]=nums1[i];
            k--;
            i--;
        }
    }  
}
}