class Solution {
    public String largestGoodInteger(String num) {
         for (int d = 9; d >= 0; d--) {
            String triplet = String.valueOf(d).repeat(3); 
            if (num.contains(triplet)) {
                return triplet;
            }
        }
        return "";
    }
}
    