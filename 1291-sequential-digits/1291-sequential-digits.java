class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer>ans=new ArrayList<>();
           for (int i = 1; i <= 9; i++) {
            find(i, low, high, ans, i + 1);
        }
        
        
        Collections.sort(ans);
        return ans;
        
    }
    public List<Integer> find(int n,int low,int high,List<Integer>ans,int add){
        
        if(n>=low && n<=high){
            ans.add(n);
            
        }
        if(add>9 || n >high){
            return ans;
        }
        n=n*10+add;
        find(n,low,high,ans,add+1);
        
        return ans;
        
        
    }
}