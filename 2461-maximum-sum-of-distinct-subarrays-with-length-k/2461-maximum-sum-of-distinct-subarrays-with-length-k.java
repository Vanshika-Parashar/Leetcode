class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        HashSet<Integer>set=new HashSet<>();
        int i=0,n=arr.length;
        long sum=0,max=Integer.MIN_VALUE;
        for(int j=0;j<n;j++){
            sum+=arr[j];
            while(set.contains(arr[j])){
                sum-=arr[i];
                set.remove(arr[i]);
                i++;
                
            }
            
            set.add(arr[j]);
            while((j-i+1)>k){
                sum-=arr[i];
                set.remove(arr[i]);
                i++;
            }
            if((j-i+1)==k){
                max=Math.max(sum,max);
            }
        }
        if(max==Integer.MIN_VALUE)return 0;
        return max;
    }
}