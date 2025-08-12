public class magic_matrix {
    public static void main(String[] args) {
        int[][] matrix = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};
        int length = matrix.length;
        int sumofactrow=15;
        int sumofrow=0;
        for(int i = 0; i < length; i++) {
            sumofrow = 0;
            for (int j = 0; j < length; j++) {
                sumofrow += matrix[i][j];
            }
        }
        if(sumofactrow==sumofrow)
        {
            System.out.println("Result: It is a Magic Square");
        }
        else{
            System.out.println("Result: It is not Magic Square");
        }
            }
        }
