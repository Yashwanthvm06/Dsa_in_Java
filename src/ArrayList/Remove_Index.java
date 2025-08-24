package List.ArrayList;
import java.util.*;
public class Remove_Index {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] ya=new int[n];
        System.out.print("Array: ");
        for(int i=0;i<n;i++){
            ya[i]=sc.nextInt();
        }
        System.out.print("Remove index: ");
        int i=2;
        int [] ya2=new int[n-1];
        for(int g=0;g<ya.length-1;g++){
            if(g<i) {
                ya2[g]=ya[g];
            }else{
                 ya2[g]=ya[g+1];
                }
        }
        System.out.print("Result: ");
        for(int e:ya2){
            System.out.print(e);
        }

    }
}
