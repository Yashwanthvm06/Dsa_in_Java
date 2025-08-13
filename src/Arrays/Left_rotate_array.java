import java.util.*;
public class Left_rotate_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [] arr=new int [n];
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int [] temp=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[(i-k+n)%n]=arr[i];
        }
        for(int rotated:temp)
        {
            System.out.print(" "+rotated);
        }
    }
}
