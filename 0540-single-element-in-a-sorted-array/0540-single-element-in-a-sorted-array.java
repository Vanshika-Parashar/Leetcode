class Solution {
    public int singleNonDuplicate(int[] n) {
        // int st=0;
        // int end=n.length-1;
        // if (n.length==1){
        //     return n[0];
        // }
        // while(st<=end){
        //     int mid=st+(end - st)/2;
        //     if(mid==0 && n[0]!=n[1]){
        //         return n[0];
        //     }
        //     if(mid==n.length-1 && n[mid]!=n[n.length-2]){
        //         return n[n.length-1];
        //     }
        //     if(n[mid-1]!=n[mid] && n[mid]!=n[mid+1]){
        //         return n[mid];
        //     }
        //     if(mid % 2== 0){
        //         if(n[mid]==n[mid-1]){
        //             end=mid-1;
        //         }
        //         else{
        //             st=mid+1;
        //         }
        //     }
        //     else{
        //         if(n[mid-1]==n[mid]){
        //             st=mid+1;
        //         }
        //         else{
        //             end=mid-1;
        //         }
        //     }
        // }
        // return 0;
        int left=0;
        int right=n.length-1;
        if(n.length==1){
            return n[0];
        }
        while(left<=right){
            int mid=left+(right-left)/2;
            if(mid==0 && n[0]!=n[1]){
                return n[0];
            }
            if(mid==n.length-1 && n[mid]!=n[n.length-2]){
                return n[n.length-1];
            }
            if(n[mid-1]!=n[mid]&& n[mid]!=n[mid+1]){
                return n[mid];
            }
            if(mid%2==0){
                if(n[mid]==n[mid-1]){
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            else{
                if(n[mid]==n[mid-1]){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        }
        return 0;
            

    }
}
