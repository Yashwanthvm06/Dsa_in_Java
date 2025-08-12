public class matrix_sum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6,}, {7, 8, 9}};
        int le = arr.length;
        int[][] arr2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        int[][] sum = new int[le][le];
        System.out.println("Matrix A:");
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
        System.out.println("Matrix B:");
        for (int[] i : arr2) {
            for (int j : i) {
                System.out.print(" " + j);
            }
            System.out.println();
        }

        for (int i = 0; i < le; i++) {
            for (int j = 0; j < le; j++) {
                sum[i][j] = arr[i][j] + arr2[i][j];
            }
        }
        System.out.println("Sum: ");
        for (int[] i : sum) {
            for (int j : i) {
                System.out.print(" " + j);
            }
            System.out.println();
        }
    }
    }

