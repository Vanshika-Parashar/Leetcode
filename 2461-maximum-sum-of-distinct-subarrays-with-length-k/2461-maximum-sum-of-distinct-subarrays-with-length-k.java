class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int i=0;
        long sum=0;
        long max=Integer.MIN_VALUE;
        Set<Integer>set=new HashSet<>();
        for(int j=0;j<arr.length;j++){
            while(set.contains(arr[j])){
                sum-=arr[i];
                set.remove(arr[i]);
                i++;
            }
            sum+=arr[j];
            set.add(arr[j]);
            while(j-i+1>k){
                sum-=arr[i];
                set.remove(arr[i]);
                i++;
            }
            if(j-i+1==k){
                max=Math.max(sum,max);
            }
        }
        if(max==Integer.MIN_VALUE)return 0;
        return max;
    }
}