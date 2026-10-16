class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;

        // Step 1: Sort the array
        Arrays.sort(nums);

        // dp[i] = length of largest divisible subset ending at i
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        // parent[i] = previous index used to build subset
        int[] parent = new int[n];
        Arrays.fill(parent, -1);

        int maxLen = 1;
        int lastIndex = 0;

        // Step 2: Build DP
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                // Since array is sorted, nums[i] >= nums[j]
                if (nums[i] % nums[j] == 0) {

                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        parent[i] = j;
                    }
                }
            }

            // Keep track of longest subset
            if (dp[i] > maxLen) {
                maxLen = dp[i];
                lastIndex = i;
            }
        }

        // Step 3: Reconstruct answer
        List<Integer> ans = new ArrayList<>();

        while (lastIndex != -1) {
            ans.add(nums[lastIndex]);
            lastIndex = parent[lastIndex];
        }

        return ans;
        
    }
}