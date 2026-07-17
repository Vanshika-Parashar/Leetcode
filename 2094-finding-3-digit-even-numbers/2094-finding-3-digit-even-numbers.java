class Solution {
    public int[] findEvenNumbers(int[] digits) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int d : digits) {
            map.put(d, map.getOrDefault(d, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 100; i <= 999; i += 2) {

            int x = i;
            int c = x % 10;
            x /= 10;
            int b = x % 10;
            x /= 10;
            int a = x;

            if (!map.containsKey(a))
                continue;

            int afreq = map.get(a);
            if (afreq == 1)
                map.remove(a);
            else
                map.put(a, afreq - 1);

            if (!map.containsKey(b)) {
                map.put(a, afreq);
                continue;
            }

            int bfreq = map.get(b);
            if (bfreq == 1)
                map.remove(b);
            else
                map.put(b, bfreq - 1);

            if (map.containsKey(c)) {
                list.add(i);
            }

            // restore
            map.put(b, bfreq);
            map.put(a, afreq);
        }

        int[] ans = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }
}