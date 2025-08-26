package List.ArrayList;
import java.util.*;
public class Reverse_ArrayList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of list ");
        int n=sc.nextInt();
        List<Integer> num=new ArrayList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter "+(i+1)+" number :");
            num.add(sc.nextInt());
        }
//for(int i=n-1;i>=0;i--){
//    System.out.println(num.get(i));
//}
        Collections.reverse(num);
        System.out.print("List after reversed :"+num);
    }
}
