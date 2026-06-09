class Solution {
    public int findFinalValue(int[] nums, int original) {
        Set<Integer> st = new HashSet<>();
        for (int num : nums) st.add(num);
        while (st.contains(original)) {
            //ans = ans * 2;
            original = original * 2;
        }
        return original;
    }
}