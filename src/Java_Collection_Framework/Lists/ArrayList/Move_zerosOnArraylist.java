package List.ArrayList;
import java.util.*;
public class Move_zerosOnArraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the " + (i + 1) + "number :");
            l1.add(sc.nextInt());
        }
        int j = 0;
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i)!=0){
                l1.set(j++,l1.get(i));
            }
        }
        while(j<l1.size()){
            l1.set(j,0);
            j++;
        }
        System.out.println(l1);
    }
}
