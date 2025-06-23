import java.util.*;
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(duration == 0)
         return 0;

         int result  = 0;
         for(int i=0; i< timeSeries.length-1; i++){
            result  += Math.min(timeSeries[i+1]- timeSeries[i], duration);
         }
         return result + duration;
    }
}