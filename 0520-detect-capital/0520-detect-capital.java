class Solution {
    public boolean detectCapitalUse(String word) {
        for (int i = 1; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(1)) != Character.isUpperCase(word.charAt(i)) ||
                Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
