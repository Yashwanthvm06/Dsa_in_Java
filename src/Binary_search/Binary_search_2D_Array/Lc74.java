

class Lc74 {
    public static void main(String[] args) {
        // Test example
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };
        int target = 5;

        Lc74 obj = new Lc74();
        boolean found = obj.searchMatrix(matrix, target);
        System.out.println("Target found: " + found); // Expected: true
    }

    /**
     * Binary search in a single row between column indices cstart and cend
     */
    public boolean bs(int[][] matrix, int row, int cstart, int cend, int target) {
        while (cstart <= cend) {
            int mid = cstart + (cend - cstart) / 2;
            if (target == matrix[row][mid]) {
                return true;
            }
            if (target < matrix[row][mid]) {
                cend = mid - 1;
            } else {
                cstart = mid + 1;
            }
        }
        return false;
    }

    /**
     * Main function to search in a 2D sorted matrix
     * Matrix is sorted in rows and columns
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // CASE 1: Only one row → do normal binary search
        if (rows == 1) {
            return bs(matrix, 0, 0, cols - 1, target);
        }

        // CASE 2: Only one column → do binary search in column
        if (cols == 1) {
            int top = 0, bottom = rows - 1;
            while (top <= bottom) {
                int mid = top + (bottom - top) / 2;
                if (matrix[mid][0] == target) return true;
                if (matrix[mid][0] < target) top = mid + 1;
                else bottom = mid - 1;
            }
            return false;
        }

        // Step 1: Narrow down to two rows
        int rstart = 0;
        int rend = rows - 1;
        int cmid = cols / 2;

        while (rstart < rend - 1) { // Loop until only two rows left
            int rmid = rstart + (rend - rstart) / 2;
            if (target == matrix[rmid][cmid]) {
                return true;
            }
            if (target < matrix[rmid][cmid]) {
                rend = rmid;
            } else {
                rstart = rmid;
            }
        }

        // Step 2: Check middle elements of the two remaining rows
        if (matrix[rstart][cmid] == target) return true;
        if (matrix[rstart + 1][cmid] == target) return true;

        // Step 3: Search in 4 quadrants
        // Quadrant 1
        if (cmid - 1 >= 0 && target <= matrix[rstart][cmid - 1]) {
            return bs(matrix, rstart, 0, cmid - 1, target);
        }
        // Quadrant 2
        if (cmid + 1 < cols && target >= matrix[rstart][cmid + 1] && target <= matrix[rstart][cols - 1]) {
            return bs(matrix, rstart, cmid + 1, cols - 1, target);
        }
        // Quadrant 3
        if (cmid - 1 >= 0 && target <= matrix[rstart + 1][cmid - 1]) {
            return bs(matrix, rstart + 1, 0, cmid - 1, target);
        }
        // Quadrant 4
        if (cmid + 1 < cols && target >= matrix[rstart + 1][cmid + 1]) {
            return bs(matrix, rstart + 1, cmid + 1, cols - 1, target);
        }

        // Not found
        return false;
    }
}
