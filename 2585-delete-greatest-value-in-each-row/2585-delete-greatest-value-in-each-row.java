class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int ans  = 0;
        for(int[] row : grid)
        Arrays.sort(row);
       for(int j=0; j<grid[0].length; j++){
        int maxCol  = 0;
        for(int i=0; i<grid.length; i++)
            maxCol = Math.max(maxCol, grid[i][j]);
            ans += maxCol;
        }
        return ans;

       

    }
}
