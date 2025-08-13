import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
          Scanner yaya = new Scanner(System.in);
//        int [] arr = new int[5];
//        for(int i=0;i<arr.length;i++) {
//            arr[i] = yaya.nextInt();
//        }
//        for (int j : arr) System.out.println(j);
//        System.out.println(Arrays.toString(arr));
        String [] str = new String[5];
        for (int i=0;i<str.length;i++){
            str[i] = yaya.next();
        }
        System.out.println(Arrays.toString(str));
        for(String u : str) System.out.println(u);
        }
    }

