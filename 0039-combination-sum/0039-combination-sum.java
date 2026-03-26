class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int t) {
        // List<List<Integer>>l1=new ArrayList<>();
        // List<Integer>l2=new ArrayList<>();
        // return combination(arr, t,l1,l2,0);
        List<Integer>ans=new ArrayList<>();
        List<List<Integer>>finalans=new ArrayList<>();
        return combination(arr,t,ans,finalans,0,0);
        
    }
    public List<List<Integer>>combination(int[]arr,int t,List<Integer>ans,List<List<Integer>>finalans,int sum,int idx){
        if(sum==t){
            List<Integer>list=new ArrayList<>();
            for(int i=0;i<ans.size();i++){
                list.add(ans.get(i));
            }
            finalans.add(list);
            return finalans;
        }
        for(int i=idx;i<arr.length;i++){
            sum+=arr[i];
            ans.add(arr[i]); 
            if(sum<=t){
                combination(arr,t,ans,finalans,sum,i);
                
            }
            ans.remove(ans.size()-1);
            sum-=arr[i];
        }
        return finalans;
    }
    // public static List<List<Integer>> combination(int[]arr,int t,List<List<Integer>>l1,List<Integer>l2,int idx){
    //     if(t==0){
    //         l1.add(new ArrayList(l2));
    //         return l1;
    //     }
    //     for(int i=idx;i<arr.length;i++){
    //         if(t>=arr[i]){
    //             l2.add(arr[i]);
    //             combination(arr,t-arr[i],l1,l2,i);
    //             l2.remove(l2.size()-1);
    //         }
    //     }
    //     return l1;
    }
