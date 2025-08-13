import java.util.*;
public class Move_0_to_end {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int [] arr=new int [n];
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
       int trans=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                arr[trans++]=arr[i];
            }
        }
        while(trans<n)
        {
            arr[trans++]=0;
        }
        System.out.println("after swapping 0's: ");
        for(int i:arr)
        {
            System.out.println(" "+i);
        }
    }
}
