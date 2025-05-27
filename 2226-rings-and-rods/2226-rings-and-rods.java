class Solution {
    public int countPoints(String rings) {
        int[][] rods = new int[10][3];

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = rings.charAt(i + 1) - '0';

            if (color == 'R') rods[rod][0] = 1;
            else if (color == 'G') rods[rod][1] = 1;
            else if (color == 'B') rods[rod][2] = 1;
        }

        int count = 0;

        for (int j = 0; j < 10; j++) {
            if (rods[j][0] == 1 &&
                rods[j][1] == 1 &&
                rods[j][2] == 1) {
                count++;
            }
        }

        return count;
    }
}
