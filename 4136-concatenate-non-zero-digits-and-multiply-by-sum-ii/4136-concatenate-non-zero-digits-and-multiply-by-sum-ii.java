class Solution {
    long mod = 1000000007L;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();

        long[] sumPrefix = new long[n + 1];
        long[] numPrefix = new long[n + 1];
        int[] countPrefix = new int[n + 1];
        long[] pow10 = new long[n + 1];

        pow10[0] = 1;

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';

            sumPrefix[i + 1] = sumPrefix[i] + digit;
            numPrefix[i + 1] = numPrefix[i];
            countPrefix[i + 1] = countPrefix[i];

            if (digit != 0) {
                numPrefix[i + 1] = (numPrefix[i] * 10 + digit) % mod;
                countPrefix[i + 1]++;
            }

            pow10[i + 1] = (pow10[i] * 10) % mod;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            long sum = sumPrefix[r + 1] - sumPrefix[l];

            int len = countPrefix[r + 1] - countPrefix[l];

            long value = (numPrefix[r + 1] - (numPrefix[l] * pow10[len]) % mod + mod) % mod;

            ans[i] = (int) ((sum % mod) * value % mod);
        }

        return ans;
    }
}