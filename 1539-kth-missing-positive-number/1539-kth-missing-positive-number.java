class Solution {
    public int findKthPositive(int[] arr, int k) {
    // ArrayList<Integer>ar=new ArrayList<>();
    // for(int i:arr){
    //     ar.add(i);
    // }
    // int nums=1;
    // int count=0;
    // while(true){
    //     if(!ar.contains(nums)){
    //         count++;
    //         if(count==k){
    //         return nums;
    //     }
        
    //     }
    //     nums++;
        
    // }
    int lo=0;
    int hi=arr.length-1;
    while(lo<=hi){
        int mid=lo+(hi-lo)/2;
        int miss=arr[mid]-(mid+1);
        if(miss<k){
            lo=mid+1;
        }
        else{
            hi=mid-1;
        }
    }
    return k+lo;
        
    }
}