class Solution {
    public String firstPalindrome(String[] words) {
        for(String word: words){
            if(isPalindrome(word)){
                return word;
            }
        }
        return "";
    }
    private boolean isPalindrome(String str){
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}