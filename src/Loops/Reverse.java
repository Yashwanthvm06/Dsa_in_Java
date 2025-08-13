import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner yu = new Scanner(System.in);
        System.out.println("Number needs to rev : ");
        int num = yu.nextInt();
        int rev=0;
        while (num > 0) {
            int rem = num%10;
            num/=10;
            rev = rev * 10 + rem;
        }
        System.out.println(rev);
    }
}
