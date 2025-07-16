class Solution {
    public int maximumLength(int[] nums) {
        int[][] dp = new int[2][2]; // dp[i][j]: last parity = i, second last parity = j
        int ans = 0;

        for (int x : nums) {
            int r = x % 2;
            for (int j = 0; j < 2; j++) {
                int y = (j - r + 2) % 2;
                dp[r][y] = dp[y][r] + 1;
                ans = Math.max(ans, dp[r][y]);
            }
        }

        return ans;
    }
}
