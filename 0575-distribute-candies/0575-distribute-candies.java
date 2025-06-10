import java.util.*;
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> unique =  new HashSet<>();
        int n =  candyType.length;
        for(int candy : candyType){
            unique.add(candy);
        }
        return Math.min(unique.size(), n/2);
    }
}