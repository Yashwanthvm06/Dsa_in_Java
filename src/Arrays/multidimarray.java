import java.util.Arrays;
import java.util.Scanner;
public class multidimarray {
    public static void main(String[] args) {
        Scanner yaya = new Scanner(System.in);
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(Arrays.deepToString(arr));
        System.out.println(arr[1][1]);
    }
}
