class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer>arr=new ArrayList<>();
        int n=nums.length;
        int[]ans=new int[2*n];
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<n;i++){
            arr.add(nums[i]);
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=arr.get(i);
        }
        return ans;

    }
}