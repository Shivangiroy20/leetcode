import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        String[]  words = s.split("");
        String[] letter = t.split("");

        if(s.length() != t.length()){
            return false;
        }

        Arrays.sort(words);
        Arrays.sort(letter);

        return Arrays.equals(words, letter);
}
}