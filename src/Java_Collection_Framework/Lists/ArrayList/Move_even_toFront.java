package List.ArrayList;
import java.util.*;
public class Move_even_toFront {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            System.out.println("Enter the " + (i + 1) + " number: ");
            l1.add(sc.nextInt());
        }
        List<Integer> odd = new ArrayList<>();
        int j=0;
        for(int i=0;i<6;i++) {
            if ((l1.get(i) % 2 == 0)) {
                l1.set(j++, l1.get(i));
            }
            else{
                odd.add(l1.get(i));
            }
        }

        for(int odds:odd)
        {
            l1.set(j++,odds);
        }
        System.out.println(l1);
        }

    }
