package List.ArrayList;
import java.util.*;
public class StrSort_Arraylist {
    public static void main(String[] args) {
        List<String> ya=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            ya.add(sc.next());
        }
        Collections.sort(ya);
        System.out.println(ya);
    }
}
