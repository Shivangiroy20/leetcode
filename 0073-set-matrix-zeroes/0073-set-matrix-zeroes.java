class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] rowZeroes = new boolean[rows];
        boolean[] colZeroes = new boolean[cols];

        // Mark rows and columns to be zeroed
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowZeroes[i] = true;
                    colZeroes[j] = true;
                }
            }
        }

        // Set rows to zero
        for (int i = 0; i < rows; i++) {
            if (rowZeroes[i]) {
                Arrays.fill(matrix[i], 0);
            }
        }

        // Set columns to zero
        for (int j = 0; j < cols; j++) {
            if (colZeroes[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}