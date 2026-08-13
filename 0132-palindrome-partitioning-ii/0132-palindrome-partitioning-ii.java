class Solution {
    public boolean valid(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public int find(String s, int[] dp, int ind) {
        if (ind == s.length()) {
            return 0;
        }
        if (dp[ind] != -1) {
            return dp[ind];
        }
        int minC = (int) 1e9;
        for (int i = ind; i < s.length(); i++) {
            if (valid(ind, i, s)) {
                int cost = 1 + find(s, dp, i + 1);
                minC = Math.min(minC, cost);
            }

        }
        return dp[ind] = minC;
    }

    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[n] = 0;

        for (int j = n - 1; j >= 0; j--) {

            int minC = (int) 1e9;
            for (int i = j ; i < s.length(); i++) {
                if (valid(j, i, s)) {
                    int cost = 1 + dp[i + 1];
                    minC = Math.min(minC, cost);
                }

            }
            dp[j] = minC;

        }
        return dp[0]-1; 

    }
}