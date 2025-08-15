import java.util.*;
public class prime_in_range {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number range : ");
        int num=sc.nextInt();
        int num2=sc.nextInt();
       isiprime(num,num2);
    }
    public static int isiprime(int start,int end)
    {
        for(int j=start;j<end;j++) {
            if (j <= 1) continue;
            boolean prime=true;
            for (int i = 2; i <Math.sqrt(j); i++) {
                if (j % i == 0){ prime=false; break;}
            }
            if(prime) System.out.println(j);
        }return 0;
    }
}
