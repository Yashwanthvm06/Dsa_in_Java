import java.util.Scanner;
public class Max_of_three {
    public static void main(String[] args) {
        Scanner yaya =new Scanner(System.in);
//        System.out.println("say upto which number : 1");
        System.out.println("three numbers : ");
        int n=yaya.nextInt();
        int m=yaya.nextInt();
        int o=yaya.nextInt();
//        int i=0 ;
//       do{
//           System.out.println(i);
//           i++;
//       }while(i<=n);
        int max = Math.max(o ,Math.max(n,m));
        System.out.println("the max is : "+max);
    }
}