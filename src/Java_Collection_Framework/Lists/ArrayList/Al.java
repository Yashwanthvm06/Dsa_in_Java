package List.ArrayList;
import java.util.*;
public class Al {
    public static void main(String[] args) {
        List<Integer> ya = new ArrayList<>();
        System.out.print("enter the size of the list: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] na = new int[n];
        System.out.print("Input:"+n+" -> ");
        for (int i = 0; i < n; i++) {
            na[i] = sc.nextInt();
        }
        System.out.print("Output :  ");
        for (int i : na) {
            System.out.print(i+" ");
        }
    }
}
