class Solution {

    public double[] medianSlidingWindow(int[] nums, int k) {

        ArrayList<Integer> window = new ArrayList<>();

        
        for (int i = 0; i < k; i++) {
            insert(window, nums[i]);
        }

        double[] ans = new double[nums.length - k + 1];

        int idx = 0;

        for (int i = k; ; i++) {

            
            if (k % 2 == 1) {
                ans[idx] = window.get(k / 2);
            } else {
                ans[idx] = ((long)window.get(k / 2 - 1)
                          + (long)window.get(k / 2)) / 2.0;
            }

            if (i == nums.length)
                break;

            remove(window, nums[i - k]);
            insert(window, nums[i]);
            idx++;
        }

        return ans;
    }

    private void insert(ArrayList<Integer> list, int val) {

        int pos = Collections.binarySearch(list, val);

        if (pos < 0)
            pos = -pos - 1;

        list.add(pos, val);
    }

    private void remove(ArrayList<Integer> list, int val) {

        int pos = Collections.binarySearch(list, val);

        list.remove(pos);
    }
}