import java.util.*;

public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, "", 0, result);
        return result;
    }

    private void backtrack(String s, int index, String current, int dots, List<String> result) {
       
        if (dots == 4 && index == s.length()) {
            result.add(current.substring(0, current.length() - 1));
            return;
        }

        if (dots >= 4 || index >= s.length()) return;

        for (int i = 1; i <= 3; i++) {
            if (index + i > s.length()) break;
            String part = s.substring(index, index + i);

           
            if ((part.length() > 1 && part.startsWith("0")) || Integer.parseInt(part) > 255)
                continue;

            backtrack(s, index + i, current + part + ".", dots + 1, result);
        }
    }
}
