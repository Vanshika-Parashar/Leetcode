class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<Integer>a=new ArrayList<>();
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                a.add(i);
            }
        }
        return a;

    }
}