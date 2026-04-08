class Solution {
    public List<List<Integer>> combine(int n, int k) {
        // List<List<Integer>>l1=new ArrayList<>();
        // List<Integer>l2=new ArrayList<>();
        // boolean[]box=new boolean[n+1];
        // int np=0;
        // return combination(n,k,np,l1,l2,box,1);
        
    
    // public static List<List<Integer>> combination(int n,int k, int np,List<List<Integer>>l1,List<Integer>l2,boolean[]box,int idx){
    //     if(k==np){
    //         l1.add(new ArrayList<>(l2));
    //         return l1;
    //     }
    //     for(int i=idx;i<=n;i++){
    //         if(box[i]==false){
    //             box[i]=true;
    //             l2.add(i);
    //             combination(n,k,np+1,l1,l2,box,i+1);
    //             box[i]=false;
    //             l2.remove(l2.size()-1);
    //         }
    //     }
    //     return l1;
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=i+1;
        }
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>list=new ArrayList<>();
        return find(nums,k,0,0,ans,list);
    }

    public List<List<Integer>> find(int[]nums,int k,int idx,int count,List<List<Integer>>ans,List<Integer>list){
        if(count==k){
            ans.add(new ArrayList<>(list));
            return ans;
        }
        for(int i=idx;i<nums.length;i++){
            list.add(nums[i]);
            find(nums,k,i+1,count+1,ans,list);
            list.remove(list.size()-1);
        }
        return ans;
    }
}