public class Solution{
    public static boolean isPalindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(s).reverse().toString();

        return s.equals(reversed);
    }
}