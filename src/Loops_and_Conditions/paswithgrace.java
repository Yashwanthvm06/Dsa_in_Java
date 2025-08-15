import java.util.*;
public class paswithgrace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks=sc.nextInt();
        if(marks>=30 && marks<=34)
        {
            System.out.println("Pass with Grace");
        }
        else if(marks>34)
        {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}
