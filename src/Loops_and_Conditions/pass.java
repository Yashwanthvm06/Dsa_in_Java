import java.util.*;
public class pass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks=sc.nextInt();
        if( marks<=100 && marks>=90){
            System.out.println("Grade: A");
        }
        else if(marks<90 && marks>=80) {
            System.out.println("Grade: B");
            }
        else if(marks<80 && marks>=70)
        {
            System.out.println("Grade: C");
        }
        else
        {
            System.out.println("Grade: F");
        }
    }
}
