import java.util.Arrays;

class Solution {
    public int minimizeMax(int[] nums, int p) {
        Arrays.sort(nums);
        int low = 0;
        int high = nums[nums.length - 1] - nums[0];

        while (low < high) {
            int mid = (low + high) / 2;

            if (countPairs(nums, mid) >= p) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    private static int countPairs(int[] nums, int maxDiff) {
        int count = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] <= maxDiff) {
                count++;
                i++; // skip the next number
            }
        }

        return count;
    }
}
