class Solution {

    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

        int nn = reservedSeats.length;

        TreeSet<Integer> set = new TreeSet<>();
        HashMap<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < nn; i++) {
            int r = reservedSeats[i][0];
            int c = reservedSeats[i][1];

            String key = r + "," + c;

            map.put(key, true);
            set.add(r);
        }

        int ans = 0;

        for (int row : set) {

            if (map.get(row + ",2") == null &&
                map.get(row + ",3") == null &&
                map.get(row + ",4") == null &&
                map.get(row + ",5") == null) {

                ans += 1;

                map.put(row + ",2", true);
                map.put(row + ",3", true);
                map.put(row + ",4", true);
                map.put(row + ",5", true);
            }

            if (map.get(row + ",4") == null &&
                map.get(row + ",5") == null &&
                map.get(row + ",6") == null &&
                map.get(row + ",7") == null) {

                ans += 1;

                map.put(row + ",4", true);
                map.put(row + ",5", true);
                map.put(row + ",6", true);
                map.put(row + ",7", true);
            }

            if (map.get(row + ",6") == null &&
                map.get(row + ",7") == null &&
                map.get(row + ",8") == null &&
                map.get(row + ",9") == null) {

                ans += 1;
            }
        }

        int used = set.size();
        int rem = (n - used) * 2;

        ans += rem;

        return ans;
    }
}