package List.ArrayList;
import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        List<Integer> first=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the list");
        int n= sc.nextInt();
        System.out.print("Enter number to insert into list: ");
        for(int i=0;i<n;i++){
            first.add(sc.nextInt());
        }
        System.out.print("The numbers inserted in array list are: ");
        for(int i:first){
            System.out.print(i +" ");
        }
        System.out.println();
        first.remove(4);
        System.out.print("List after removing one element :" +first);
    }
}
