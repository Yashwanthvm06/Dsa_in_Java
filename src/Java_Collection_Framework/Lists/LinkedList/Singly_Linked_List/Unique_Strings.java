package List.LinkedList;
import java.util.*;
public class Unique_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the ll : ");
        int n=sc.nextInt();
        List<String> str=new LinkedList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" String ");
            str.add(i,sc.next());
        }
        List<String> str1=new LinkedList<>();
        for(int i=0;i<n;i++){
            System.out.println("Enter the "+(i+1)+" String for ll2: ");
            str1.add(i,sc.next());
        }
          List<String> str2=new LinkedList<>(str);
        System.out.println(str2.retainAll(str1));
        System.out.println(str2);
//        for(int i=0;i<n;i++){
//            String s=str.get(i);
//            if(str2.contains(s)){
//                str2.add(s);
//            }
//        }
//        System.out.println(str2);
    }
}
