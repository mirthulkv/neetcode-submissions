class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        // Binary search for the row
        int l1 = 0;
        int r1 = m - 1;
        int row = -1;

        while (l1 <= r1) {
            int m1 = l1 + (r1 - l1) / 2;

            if (target < matrix[m1][0]) {
                r1 = m1 - 1;
            }
            else if (target > matrix[m1][n - 1]) {
                l1 = m1 + 1;
            }
            else {
                row = m1;
                break;
            }
        }

        // No possible row
        if (row == -1) {
            return false;
        }

        // Binary search inside the row
        int l2 = 0;
        int r2 = n - 1;

        while (l2 <= r2) {
            int m2 = l2 + (r2 - l2) / 2;

            if (matrix[row][m2] == target) {
                return true;
            }
            else if (matrix[row][m2] < target) {
                l2 = m2 + 1;
            }
            else {
                r2 = m2 - 1;
            }
        }

        return false;
    }
}