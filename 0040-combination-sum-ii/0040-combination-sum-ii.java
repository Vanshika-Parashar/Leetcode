class Solution {
    public List<List<Integer>> combinationSum2(int[] arr, int t) {
        List<List<Integer>>l1=new ArrayList<>();
        List<Integer>l2=new ArrayList<>();
        Arrays.sort(arr);
        return combination(arr,t,l1,l2,0);
        
    }
    public static List<List<Integer>> combination(int[]arr,int t,List<List<Integer>>l1, List<Integer>l2,int idx){
        // if(t==0){
        //     l1.add(new ArrayList<>(l2));
        //     return l1;
        // }
        // for(int i=idx;i<arr.length;i++){
        //     if (i > idx && arr[i] == arr[i - 1]) continue;

        //     if(arr[i]<=t){
        //         l2.add(arr[i]);
        //         combination(arr,t-arr[i],l1,l2,i+1);
        //         l2.remove(l2.size()-1);
        //     }
        // }
        // return l1;
        if(t==0){
            List<Integer>l=new ArrayList<>();
            for(int i=0;i<l2.size();i++){
                l.add(l2.get(i));
            }
            l1.add(l);
            return l1;
        }
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1])continue;
            if(arr[i]<=t){
                l2.add(arr[i]);
                combination(arr,t-arr[i],l1,l2,i+1);
                l2.remove(l2.size()-1);
            }
        }
        return l1;
    }
}