import java.util.*;

class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.toLowerCase().split(" ");
        String result = "";

        for (String word : words) {
            if (word.length() <= 2) {
                result += word + " ";
            } else {
                result += word.substring(0, 1).toUpperCase() + word.substring(1) + " ";
            }
        }
        return result.trim(); 
    }
}
