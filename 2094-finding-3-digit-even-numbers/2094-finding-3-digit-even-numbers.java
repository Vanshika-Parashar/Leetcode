class Solution {
    public int[] findEvenNumbers(int[] digits) {
        List<Integer>list=new ArrayList<>();
        boolean[]check=new boolean[digits.length];
        list=find(digits,1,0,list,check,0);
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<list.size();i++){
            set.add(list.get(i));
        }
        int[]ans=new int[set.size()];
        int idx=0;
        for(int i:set){
            ans[idx++]=i;
        }
        Arrays.sort(ans);
        return ans;
        
    }
    public List<Integer> find(int[]arr, int no,int idx,List<Integer>list,boolean[]check,int ans){
        if(no==4 ){
            if(ans%2==0){
                list.add(ans);
                
            }
            return list;
        }
        for(int i=0;i<arr.length;i++){
            if(no==1 && arr[i]==0){
                continue;
            }else{
                if(check[i]==false){
                    ans=ans*10+arr[i];
                    check[i]=true;
                    find(arr,no+1,i,list,check,ans);
                    ans=ans/10;
                    check[i]=false;
                }
            }
        }
        return list;
    }
}