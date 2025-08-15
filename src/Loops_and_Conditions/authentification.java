import java.util.*;
public class authentification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username="admin";
        String userpass="1234";
        System.out.print("Enter username: ");
        String usercheck= sc.next();
        System.out.print("Enter userpass: ");
        String upcheck=sc.next();
        if(username.equals(usercheck) && userpass.equals(upcheck))
        {
            System.out.println("Login Succesfull");
        }
        else{
            System.out.println("Invalid credential");
        }

    }
}
