class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size()];

        for(int i=0; i<timePoints.size();i++){
            String[]  parts  = timePoints.get(i).split(":");
            int hour = Integer.parseInt(parts[0]);
            int min = Integer.parseInt(parts[1]);
            minutes[i] = hour * 60 + min;          
        }
        Arrays.sort(minutes);
        int minDiff = Integer.MAX_VALUE;
        for(int i=1; i<minutes.length; i++){
            minDiff = Math.min(minDiff, minutes[i]- minutes[i-1]);
        }
        int wrapAround = 1440 - minutes[minutes.length - 1] + minutes[0];
        minDiff = Math.min(minDiff, wrapAround);

        return minDiff;
    }
}