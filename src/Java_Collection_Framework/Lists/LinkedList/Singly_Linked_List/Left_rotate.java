package List.LinkedList;
import java.util.*;
public class Left_rotate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of list: ");
        int n=sc.nextInt();
        List<Integer>li=new LinkedList<>();
        for(int i=0;i<n;i++){
            System.out.print("Enter the "+(i+1)+" element: ");
            li.add(i,sc.nextInt());
        }
        System.out.println("enter the position you want to rotate by left");
        int k=sc.nextInt();
        k=k%n;
        List<Integer> li2=new LinkedList<>();
        li2.addAll(li.subList(k,n));
        li2.addAll(li.subList(0,k));
        System.out.print("After left rotated: ");
        System.out.println(li2);
    }
}
