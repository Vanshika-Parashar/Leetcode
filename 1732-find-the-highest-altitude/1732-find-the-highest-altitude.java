class Solution {
    public int largestAltitude(int[] gain) {
        List<Integer>ans=new ArrayList<>();
        int sum=0;
        ans.add(0);
        for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            ans.add(sum);
        }
        return Collections.max(ans);
        
    }
}