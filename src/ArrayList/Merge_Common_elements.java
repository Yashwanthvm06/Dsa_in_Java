package List.ArrayList;
import java.util.*;
public class Merge_Common_elements {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("How many names in list 1? ");
        int n1 = sc.nextInt();
        System.out.print("How many names in list 2? ");
        int n2 = sc.nextInt();
        System.out.print("Names for list 1 : ");
        for (int i = 0; i < n1; i++) {
            String name_list1 = sc.next();
            list1.add(name_list1);
        }
        System.out.print("Names for list 2 : ");
        for (int i = 0; i < n2; i++) {
            String name_list2 = sc.next();
            list2.add(name_list2);
        }
//        List<String> list3 = new ArrayList<>();
//        for(String s:list1) {
//            if (list2.contains(s)) {
//                list3.add(s);
//            }
//        }
//        System.out.println(list1 );
//        System.out.println(list2);
//        System.out.println(list3);
//    }

        //advanced method is to use retainAll();
List<String>list3=new ArrayList<>(list1);
        list3.retainAll(list2);
        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Common Elements: " + list3);

    }

}
