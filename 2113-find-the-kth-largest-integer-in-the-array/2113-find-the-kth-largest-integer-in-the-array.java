import java.util.*;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        // sort the string based on numeric value
      Arrays.sort(nums,(a, b) -> {
        if(a.length() != b.length()){
            return a.length() - b.length();
        }else{
            return a.compareTo(b);
        }
      });
        return nums[nums.length-k];
        
    }
}