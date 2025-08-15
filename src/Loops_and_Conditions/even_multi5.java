import java.util.*;
public class even_multi5 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        if(number%2==0){
            if(number%5==0)
            {
                System.out.println("Even and a multiple of 5");
            }
        }
        else{
            System.out.println("Number is odd");
        }
    }
}
