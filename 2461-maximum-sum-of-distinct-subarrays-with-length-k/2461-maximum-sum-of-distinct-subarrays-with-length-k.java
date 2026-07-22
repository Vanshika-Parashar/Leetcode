class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        HashSet<Integer>set=new HashSet<>();
        int i=0;
        long sum=0;
        
        
        long max=0;
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
        return max;
        
        

        
    }
}