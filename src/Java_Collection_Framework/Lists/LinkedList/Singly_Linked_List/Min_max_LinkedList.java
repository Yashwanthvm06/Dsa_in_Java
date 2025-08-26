package List.LinkedList;
import java.util.*;
public class Min_max_LinkedList {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     List<Integer> nums=new LinkedList<>();
     for(int i=0;i<10;i++){
         System.out.print("Enter the "+(i+1)+" element: ");
         nums.add(i,sc.nextInt());
     }
     int min=Integer.MAX_VALUE;
     int max=Integer.MIN_VALUE;
     for(int n:nums){
         if(n>max){
             max=n;
         }
         if(n<min){
             min=n;
         }
     }
        System.out.println("MIN: "+min+" \nMAX: "+max);
    }
}
