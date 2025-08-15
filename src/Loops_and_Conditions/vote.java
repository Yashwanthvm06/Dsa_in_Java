import java.util.*;
public class vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Age: ");
        int age=sc.nextInt();
        if(age<18)
        {
            System.out.println("Not Eligible to vote");
        }
        else{
            System.out.println("Eligible to vote");
        }
    }
}
