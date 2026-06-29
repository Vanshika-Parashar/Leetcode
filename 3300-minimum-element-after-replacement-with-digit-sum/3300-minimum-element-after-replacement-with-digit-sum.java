class Solution {
    public int minElement(int[] nums) {
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int p=nums[i];
            int sum=0;
            while(p>0){
                int m=p%10;
                sum+=m;
                p=p/10;
            }
            ans.add(sum);
        }
        return Collections.min(ans);
    }
}