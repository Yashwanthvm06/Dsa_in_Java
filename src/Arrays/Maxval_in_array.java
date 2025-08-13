
import java.util.Scanner;

public class Maxval_in_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int [] arr=new int [n];
        System.out.print("Enter the array: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
if(max<arr[i])
{
    max=arr[i];
}
if(arr[i]<min)
{
    min=arr[i];
}
        }
        System.out.println("Max value is: "+max + " and " +"min value is: "+min);

    }
}
