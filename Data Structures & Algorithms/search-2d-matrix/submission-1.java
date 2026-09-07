class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        // Find the correct row
        int l = 0;
        int r = m - 1;
        int m1 = 0;

        while (l <= r) {
            m1 = l + (r - l) / 2;

            if (target < matrix[m1][0]) {
                r = m1 - 1;
            }
            else if (target > matrix[m1][n - 1]) {
                l = m1 + 1;
            }
            else {
                break;
            }
        }

        // Check if row was found
        if (l > r) {
            return false;
        }

        // Binary search inside the row
        int row = m1;
        l = 0;
        r = n - 1;

        while (l <= r) {
            int m2 = l + (r - l) / 2;

            if (matrix[row][m2] == target) {
                return true;
            }
            else if (matrix[row][m2] < target) {
                l = m2 + 1;
            }
            else {
                r = m2 - 1;
            }
        }

        return false;
    }
}