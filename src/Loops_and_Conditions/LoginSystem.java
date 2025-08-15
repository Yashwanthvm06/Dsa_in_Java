import java.util.*;
public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Predefined username and password
        String correctUsername = "admin";
        String correctPassword = "1234";

        // Taking input from user
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // Checking credentials
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid credentials.");
        }
    }
}
