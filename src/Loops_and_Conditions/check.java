import java.util.*;
public class check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("isStudent: ");
        boolean stu= sc.nextBoolean();
        System.out.print("hasIDCard: ");
        boolean id= sc.hasNextBoolean();
if(stu && id)
{
    System.out.println("Access granted");
}
else{
    System.out.println("Access denied");
}
    }
}
