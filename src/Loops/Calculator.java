import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner aya = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter the operator");
            char operator = aya.next().trim().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%'){
                System.out.println("Enter two numbers : ");
            int num1 = aya.nextInt();
            int num2 = aya.nextInt();
            if (operator == '+') {
                ans = num1 + num2;
            }
            if (operator == '-') {
                ans = num1 - num2;
            }
            if (operator == '*') {
                ans = num1 * num2;
            }
            if (operator == '/') {
                ans = num1 / num2;
            }
            if (operator == '%') {
                ans = num1 % num2;
            }} else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid");
            }
            System.out.println(ans);
        }
        }
    }
