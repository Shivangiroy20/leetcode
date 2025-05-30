import java.util.*;

class Solution {
    private Map<String, Long> memo = new HashMap<>();

    public long minCuttingCost(int n, int m, int k) {
        long minCost = Long.MAX_VALUE;

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3 - i; j++) {
                if ((long) n <= (long) i * k && (long) m <= (long) j * k) {
                    long costN = minCutCostHelper(n, i, k);
                    long costM = minCutCostHelper(m, j, k);
                    if (costN != Long.MAX_VALUE && costM != Long.MAX_VALUE) {
                        minCost = Math.min(minCost, costN + costM);
                    }
                }
            }
        }

        return minCost == Long.MAX_VALUE ? -1 : minCost;
    }

    private long minCutCostHelper(int x, int parts, int k) {
        if (parts == 1) return x <= k ? 0L : Long.MAX_VALUE;

        String key = x + "," + parts;
        if (memo.containsKey(key)) return memo.get(key);

        long minCost = Long.MAX_VALUE;
        for (int cut = 1; cut < x; cut++) {
            int left = cut;
            int right = x - cut;
            long cutCost = (long) left * right;

            for (int leftParts = 1; leftParts < parts; leftParts++) {
                int rightParts = parts - leftParts;

                long leftCost = minCutCostHelper(left, leftParts, k);
                long rightCost = minCutCostHelper(right, rightParts, k);

                if (leftCost != Long.MAX_VALUE && rightCost != Long.MAX_VALUE) {
                    minCost = Math.min(minCost, cutCost + leftCost + rightCost);
                }
            }
        }

        memo.put(key, minCost);
        return minCost;
    }
}
