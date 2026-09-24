class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        int i=0;
        long sum=0;
        long max=Integer.MIN_VALUE;
        HashSet<Integer>set=new HashSet<>();
        for(int j=0;j<arr.length;j++){
            while(set.contains(arr[j])){
                set.remove(arr[i]);
                sum-=arr[i];
                i++;
            }
            set.add(arr[j]);
            sum+=arr[j];
            while(j-i+1>k){
                set.remove(arr[i]);
                sum-=arr[i];
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