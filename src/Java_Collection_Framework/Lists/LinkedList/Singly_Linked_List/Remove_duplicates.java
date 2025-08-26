package List.LinkedList;
import java.util.*;
public class Remove_duplicates {
    public static void main(String[] args) {
        List<Integer> ya=new LinkedList<>();
        System.out.print("enter the size of the array: ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("enter the "+(i+1)+ " element: ");
            ya.add(i, sc.nextInt());
        }

        List<Integer> ya1=new LinkedList<>();
        for(int j=0;j<ya.size();j++){
            int na=ya.get(j);
            if(!ya1.contains(na)){
               ya1.add(na);
            }
        }
        System.out.println(ya1);
    }
}
