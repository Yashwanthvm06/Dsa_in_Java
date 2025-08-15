import java.util.*;
public class max {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A: ");
        int a = sc.nextInt();
        System.out.print("Enter B: ");
        int b = sc.nextInt();
        System.out.print("Enter C: ");
        int c = sc.nextInt();
        int res=a>b?a<c?c:a:c<b?b:c;
        System.out.println("Maximum: "+res);
    }
}