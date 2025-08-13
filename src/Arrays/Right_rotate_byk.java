import java.util.*;

import static java.util.Collections.rotate;

public class Right_rotate_byk {
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
        int[] res=rotate(arr,k);
        for(int i:res)
        {
            System.out.print(" "+i);
        }
    }
    public static int[] rotate(int[] arr,int k)
    {
        int n=arr.length;
        int [] temp=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            temp[(i+k)%n]=arr[i];
        }
      return temp;
    }
}
