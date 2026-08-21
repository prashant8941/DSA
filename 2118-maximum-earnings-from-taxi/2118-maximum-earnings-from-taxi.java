class Solution {

    class Pair {
        int start;
        int end;
        long profit;

        Pair(int start, int end, long profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    public long maxTaxiEarnings(int n, int[][] rides) {

        int len = rides.length;

        Pair[] arr = new Pair[len];

        for (int i = 0; i < len; i++) {

            int s = rides[i][0];
            int e = rides[i][1];
            long t = rides[i][2];

            long p = (long) e - s + t;

            arr[i] = new Pair(s, e, p);
        }

        Arrays.sort(arr, (x, y) -> {
            if (x.start != y.start) {
                return Integer.compare(x.start, y.start);
            } else {
                return Long.compare(y.profit, x.profit);
            }
        });

        long[] dp = new long[len];

        Arrays.fill(dp, -1L);

        return find(0, arr, dp);
    }

    public long find(int i, Pair[] arr, long[] dp) {

        if (i >= arr.length) {
            return 0L;
        }

        if (dp[i] != -1L) {
            return dp[i];
        }

        int next = bs(arr[i].end, arr);

        long take = arr[i].profit + find(next, arr, dp);

        long skip = find(i + 1, arr, dp);

        return dp[i] = Math.max(take, skip);
    }

    public int bs(int endTime, Pair[] arr) {

        int l = 0;
        int r = arr.length - 1;
        int ans = arr.length;

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (arr[mid].start >= endTime) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return ans;
    }
}