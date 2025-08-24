package List.ArrayList;
import java.sql.SQLOutput;
import java.util.*;
public class LeftRotatae_ArrayList_Byk {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        System.out.println("Enter the position of the array list to be rotated: ");
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=list1.size();
        k=k%n;
        System.out.println("Left Rotation: ");
        List<Integer> temp=new ArrayList<>();
        temp.addAll(list1.subList(k,n));
        temp.addAll(list1.subList(0,k));
        System.out.println(list1);
        System.out.println(temp);


        List<Integer> tempp=new ArrayList<>();
        System.out.println("Right rotation: ");
        tempp.addAll(list1.subList(n-k,n));
        tempp.addAll(list1.subList(0,n-k));
        System.out.println(list1);
        System.out.println(tempp);
    }
}
