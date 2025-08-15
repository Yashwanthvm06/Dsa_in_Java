import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        if(isprime(num))
        {
            System.out.println("prime");
        }
        else{
            System.out.println(num + " the number is not prime");
        }

    }
    public static boolean isprime(int number)
    {
        if(number<=1) return false;
        for(int i=2;i<Math.sqrt(number);i++)
        {
            if(number%i==0) return false;
        }
        return true;
    }
}
