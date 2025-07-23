public class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return removeSubstring(s, "ab", x, y);
        } else {
            return removeSubstring(s, "ba", y, x);
        }
    }

    private int removeSubstring(String s, String first, int firstScore, int secondScore) {
        Stack<Character> stack = new Stack<>();
        int score = 0;

        // Remove first pattern
        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == first.charAt(0) && c == first.charAt(1)) {
                stack.pop();
                score += firstScore;
            } else {
                stack.push(c);
            }
        }

        // Now remove second pattern from the remaining stack
        StringBuilder remaining = new StringBuilder();
        while (!stack.isEmpty()) {
            remaining.append(stack.pop());
        }

        // Process second pattern in reverse order
        stack = new Stack<>();
        for (int i = remaining.length() - 1; i >= 0; i--) {
            char c = remaining.charAt(i);
            if (!stack.isEmpty() && stack.peek() == first.charAt(1) && c == first.charAt(0)) {
                stack.pop();
                score += secondScore;
            } else {
                stack.push(c);
            }
        }

        return score;
    }
}
